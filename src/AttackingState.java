public class AttackingState implements GuardState{

	@Override
	public GuardState hearNoise() {
        System.out.println("Guard is too busy atticking!");
        return new AttackingState();
	}

	@Override
	public GuardState seeEnemy() {
        System.out.println("Guard Has Spotted Enemy");
        return new AttackingState();
	}

	@Override
	public GuardState loseTarget() {
        System.out.println("Guard is searching for the escaped enemy!");
        return new PatrollingState();
	}


}
