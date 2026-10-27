public class SentinelGuard {
    enum State{
       Idle, Patroling, Attacking
    }
    //f
    private GuardState currentState;
    //c
    SentinelGuard(GuardState state){
        this.currentState = state;
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
