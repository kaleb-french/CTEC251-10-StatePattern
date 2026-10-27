public class SentinelGuard {
    enum State{
       Idle, Patroling, Attacking
    }
    //f
    private GuardState currentState;
    //c
    SentinelGuard(){
        currentState = new IdleState();
    }
    //m
    public void hearNoise(){
        currentState = currentState.hearNoise();
    }
    public void seeEnemy(){
        currentState = currentState.seeEnemy();
    }
    public void loseTarget(){
        currentState = currentState.loseTarget();
    }
}
