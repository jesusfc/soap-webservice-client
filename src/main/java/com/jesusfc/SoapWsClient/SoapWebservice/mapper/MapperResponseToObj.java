package com.jesusfc.SoapWsClient.SoapWebservice.mapper;

import com.jesusfc.SoapWsClient.SoapWebservice.SoapSchemas.GetBankResponseType;
import com.jesusfc.SoapWsClient.model.BankDetails;

import javax.xml.bind.JAXBElement;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
public class MapperResponseToObj {

    public BankDetails mapperBankDetails(JAXBElement<GetBankResponseType> obj) {
        BankDetails bankDetails = new BankDetails();
        bankDetails.setBezeichnung(obj.getValue().getDetails().getBezeichnung());
        bankDetails.setBic(obj.getValue().getDetails().getBic());
        bankDetails.setOrt(obj.getValue().getDetails().getOrt());
        bankDetails.setPlz(obj.getValue().getDetails().getPlz());
        return bankDetails;
    }

}
