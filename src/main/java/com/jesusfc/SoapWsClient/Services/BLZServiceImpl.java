package com.jesusfc.SoapWsClient.Services;

import com.jesusfc.SoapWsClient.SoapWebservice.SoapSchemas.GetBankResponseType;
import com.jesusfc.SoapWsClient.SoapWebservice.SoapSchemas.GetBankType;
import com.jesusfc.SoapWsClient.SoapWebservice.SoapService.SOAPConnector;
import com.jesusfc.SoapWsClient.SoapWebservice.mapper.MapperResponseToObj;
import com.jesusfc.SoapWsClient.model.BankDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Service
public class BLZServiceImpl implements BLZService {

    @Value("${property_key_uri_Soap_Web_Service}")
    private String uriWebService;

    private final SOAPConnector soapConnector;

    public BLZServiceImpl(SOAPConnector soapConnector) {
        this.soapConnector = soapConnector;
    }

    @Override
    public BankDetails getBankInformation() {
        String valueBlz = "12070000";
        GetBankType getBankTypeRequest = new GetBankType();
        getBankTypeRequest.setBlz(valueBlz);
        JAXBElement<GetBankResponseType> response = (JAXBElement<GetBankResponseType>) soapConnector.callWebService(uriWebService, getBankTypeRequest);
        MapperResponseToObj mapperResponseToObj = new MapperResponseToObj();
        return mapperResponseToObj.mapperBankDetails(response);
    }
}
