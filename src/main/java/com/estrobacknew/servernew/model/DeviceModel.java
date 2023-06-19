package com.estrobacknew.servernew.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Devices")
public class DeviceModel {

    @Id
    private String id;
    private String device;
    private String number;

    public String getId() {
        return id;
    }

    @Indexed(unique = true)
    private String IMEI;

    public DeviceModel(String device, String number, String IMEI) {
        this.device = device;
        this.number = number;
        this.IMEI = IMEI;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
