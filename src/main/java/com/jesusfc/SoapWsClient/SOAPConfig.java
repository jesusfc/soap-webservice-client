package com.jesusfc.SoapWsClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SOAPConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        // this is the package name specified in the <generatePackage> specified in pom.xml
        marshaller.setContextPath("com.jesusfc.schemas");
        return marshaller;
    }

    @Bean
    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
        SOAPConnector client = new SOAPConnector();
        client.setDefaultUri("http://www.thomas-bayer.com/axis2/services/BLZService");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
