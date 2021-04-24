package com.jesusfc.SoapWsClient.model;

import lombok.Data;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
public @Data
class BankDetails {
    private String bezeichnung;
    private String bic;
    private String ort;
    private String plz;
}
