package springboot.soaptest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import springboot.soaptest.wsdl.GetQuote;
import springboot.soaptest.wsdl.GetQuoteResponse;

/**
 * Created by CTWLPC on 2017/8/3.
 */
public class QuoteClient extends WebServiceGatewaySupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(QuoteClient.class);
    public GetQuoteResponse getQuote(String ticker){
        GetQuote request = new GetQuote();
        request.setSymbol(ticker);
        LOGGER.info("requesting quete for"+ticker);
        GetQuoteResponse response = (GetQuoteResponse)getWebServiceTemplate()
                .marshalSendAndReceive("http://www.webservicex.com/stockquote.asmx",
                        request,
                        new SoapActionCallback("http://www.webserviceX.NET/GetQuote"));
        return response;
    }
}
