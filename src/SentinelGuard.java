public class SentinelGuard {
    enum State{
       Idle, Patroling, Attacking
    }
    //f
    private State currentState;
    //c
    SentinelGuard(){
        currentState = State.Idle;
    }
    //m
    public void hearNoise(){
        switch (currentState) {
            case Idle:
                System.out.println("Guard is investigating!");
                currentState = State.Patroling;
                break;
            case Patroling:
                System.out.println("Guard is already on alert!");
                currentState = State.Patroling;
                break;
            case Attacking:
                System.out.println("Guard is too busy atticking!");
                currentState = State.Attacking;
                break;
        }
    }
    public void seeEnemy(){
        switch (currentState) {
            case Idle:
                System.out.println("Guard Has Spotted Enemy");
                currentState = State.Attacking;
                break;
            case Patroling:
                System.out.println("Guard Has Spotted Enemy");
                currentState = State.Attacking;
                break;
            case Attacking:
                System.out.println("Guard Has Spotted Enemy");
                currentState = State.Attacking;
                break;
        }
    }
    public void loseTarget(){
        switch (currentState) {
            case Idle:
                System.out.println("No Target to lose");
                currentState = State.Idle;
                break;
            case Patroling:
                System.out.println("No Target to lose");
                currentState = State.Patroling;
                break;
            case Attacking:
                System.out.println("Guard is searching for the escaped enemy!");
                currentState = State.Patroling;
                break;
        }
    }
}
