package springboot;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by CTWLPC on 2017/8/1.
 */
@Component
public class ScheduleTask {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println(dateFormat.format(new Date()));
    }
}
