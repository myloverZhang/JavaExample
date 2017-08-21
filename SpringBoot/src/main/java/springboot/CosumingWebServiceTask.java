package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

/**
 * Created by CTWLPC on 2017/8/1.
 */
@SpringBootApplication
public class CosumingWebServiceTask {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        JsonAreaInfo areaInfo = restTemplate.getForObject("http://source.dc.uc108.org:8899/api/area/ip2area?ip=122.224.230.90", JsonAreaInfo.class);
        System.out.println(areaInfo.toString());
    }
}
