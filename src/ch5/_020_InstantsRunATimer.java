package ch5;


import java.time.Duration;
import java.time.Instant;

public class _020_InstantsRunATimer {

    public static void main(String[] args) throws InterruptedException {
        Instant now = Instant.now();
        // do something time consuming
        Thread.sleep(1000);
        Instant later = Instant.now();

        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());

    }
}
