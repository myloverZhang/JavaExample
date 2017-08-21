package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by CTWLPC on 2017/8/1.
 */
@SpringBootApplication
 public class Execute{
    public static void main(String[] args) {
        SpringApplication.run(TestAction.class, args);
    }

}
