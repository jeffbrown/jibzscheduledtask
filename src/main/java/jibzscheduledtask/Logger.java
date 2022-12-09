package jibzscheduledtask;

import io.micronaut.scheduling.annotation.Scheduled;
import jakarta.inject.Singleton;

@Singleton
public class Logger {

    @Scheduled(fixedDelay = "${params.fixed-delay:60m}", initialDelay = "${params.initial-delay:10s}")
    public void scan() {
        System.out.println("Logger.scan() is running...");
    }

}
