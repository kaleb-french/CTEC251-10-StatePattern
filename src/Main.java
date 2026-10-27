public class Main {
    static void main() {
        SentinelGuard guard = new SentinelGuard(new SleepingState());

        guard.loseTarget();
        guard.seeEnemy();
        guard.loseTarget();

        guard.hearNoise();

        guard.seeEnemy();
        guard.loseTarget();

        guard.loseTarget();
    }
}
