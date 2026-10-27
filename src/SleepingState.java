public class SleepingState implements GuardState{

	@Override
	public GuardState hearNoise() {
		System.out.println("The Guard wakes up and searches for the noise.");
		return new PatrollingState();
	}

	@Override
	public GuardState seeEnemy() {
		return new SleepingState();
	}

	@Override
	public GuardState loseTarget() {
		return new SleepingState();
	}


}
