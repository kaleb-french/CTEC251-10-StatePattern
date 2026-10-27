public class IdleState implements GuardState{

	@Override
	public GuardState hearNoise() {
        System.out.println("Guard is investigating!");
        return new PatrollingState();
	}

	@Override
	public GuardState seeEnemy() {
	    System.out.println("Guard Has Spotted Enemy");
        return new AttackingState();
	}

	@Override
	public GuardState loseTarget() {
        System.out.println("No Target to lose");
        return new IdleState();
	}

}
