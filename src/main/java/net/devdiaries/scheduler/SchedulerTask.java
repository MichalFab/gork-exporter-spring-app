package net.devdiaries.scheduler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class SchedulerTask {

    private static final Logger logger = LogManager.getLogger(SchedulerTask.class);
    private Random random = new Random();

    @Scheduled(fixedRate = 10000)
    public void generateLog() {
        List<String> list = List.of("byeService", "helloDB", "notificationService");
        String randomElement = list.get(random.nextInt(2));
        logger.info("{} connection time= {} ", randomElement, random.nextInt(3000));
    }
}
