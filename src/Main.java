public class Main {
    static void main() {
        SentinelGuard guard = new SentinelGuard(new SleepingState());

        guard.hearNoise();
        guard.seeEnemy();
        guard.loseTarget();
    }
}
