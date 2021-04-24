package com.jesusfc.SoapWsClient;

import com.jesusfc.SoapWsClient.SoapWebservice.SoapSchemas.GetBankResponseType;
import com.jesusfc.SoapWsClient.SoapWebservice.SoapSchemas.GetBankType;
import com.jesusfc.SoapWsClient.SoapWebservice.SoapService.SOAPConnector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.bind.JAXBElement;

@SpringBootApplication
public class SoapWsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapWsClientApplication.class, args);
    }

   // @Value("${property_key_uri_Soap_Web_Service}")
    //private String uriWebService;

    /*

    @Bean
    CommandLineRunner lineRunner(SOAPConnector soapConnector) {

        return args -> {
            String valueBlz = "12070000";
            if (args.length > 0) {
                valueBlz = args[0];
            }
            GetBankType getBankTypeRequest = new GetBankType();
            getBankTypeRequest.setBlz(valueBlz);
            JAXBElement<GetBankResponseType> response = (JAXBElement<GetBankResponseType>) soapConnector.callWebService(uriWebService, getBankTypeRequest);
            System.out.println("Got Response As below ========= : ");
            System.out.println("Bezeichnung: " + response.getValue().getDetails().getBezeichnung());
            System.out.println("bic: " + response.getValue().getDetails().getBic());
            System.out.println("ort: " + response.getValue().getDetails().getOrt());
            System.out.println("plz: " + response.getValue().getDetails().getPlz());
        };
    }
    */
}
