package springboot;

import org.springframework.scheduling.annotation.EnableScheduling;
import springboot.fileupload.storage.StorageProperties;
import springboot.fileupload.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import springboot.soaptest.QuoteClient;
import springboot.soaptest.wsdl.GetQuoteResponse;

/**
 * Created by CTWLPC on 2017/8/1.
 */
@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(StorageProperties.class)
public class UploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(UploadApplication.class, args);
    }

    @Bean
    CommandLineRunner init(StorageService storageService, QuoteClient quoteClient){
        return (args)->{
            storageService.deleteAll();
            storageService.init();
            String ticker = "MSFT";
            if (args.length>0){
                ticker = args[0];
            }
//            GetQuoteResponse response = quoteClient.getQuote(ticker);
//            System.err.println(response.getGetQuoteResult());
        };
    }
}
