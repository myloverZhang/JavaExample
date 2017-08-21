package springboot.soaptest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by CTWLPC on 2017/8/3.
 */
@Configuration
public class QuoteConfiguration {
    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("springboot.soaptest.wsdl");
        return marshaller;
    }

    @Bean
    public QuoteClient quoteClient(Jaxb2Marshaller marshaller){
        QuoteClient client = new QuoteClient();
        client.setDefaultUri("http://www.webservicex.com/stockquote.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
