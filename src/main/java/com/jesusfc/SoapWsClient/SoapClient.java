package com.jesusfc.SoapWsClient;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.ws.WebEndpoint;

@Service
public class SoapClient {
    private Jaxb2Marshaller marshaller;
    private WebServiceTemplate template;

}
