package com.jesusfc.SoapWsClient.Services;

import com.jesusfc.SoapWsClient.model.BankDetails;
import org.springframework.stereotype.Service;

/**
 * Created By Jesús Fdez. Caraballo on 24/04/2021.
 */
public interface BLZService {
    BankDetails getBankInformation(String valueBlz);
}
