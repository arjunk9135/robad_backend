package com.estrobacknew.servernew.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Approved")
public class ApprovedModel {
    @Id
    private String id;
    private String device;
    private String number;
    private String imei;
    private  String light;
    private  String speaker;
    private  String antenna;
    private  String time;
    private  String configuration1;
    private  String configuration2;
    private  String configuration3;
    private  String configuration4;
    private  String configuration5;
    private  String configuration6;
    private  String configuration7;
    private String configuration8;

    private String lightreview;
    private String speakerreview;
    private String antennareview;

    public String getLightreview() {
        return lightreview;
    }

    public void setLightreview(String lightreview) {
        this.lightreview = lightreview;
    }

    public String getSpeakerreview() {
        return speakerreview;
    }

    public void setSpeakerreview(String speakerreview) {
        this.speakerreview = speakerreview;
    }

    public String getAntennareview() {
        return antennareview;
    }

    public void setAntennareview(String antennareview) {
        this.antennareview = antennareview;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getAntenna() {
        return antenna;
    }

    public void setAntenna(String antenna) {
        this.antenna = antenna;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getConfiguration1() {
        return configuration1;
    }

    public void setConfiguration1(String configuration1) {
        this.configuration1 = configuration1;
    }

    public String getConfiguration2() {
        return configuration2;
    }

    public void setConfiguration2(String configuration2) {
        this.configuration2 = configuration2;
    }

    public String getConfiguration3() {
        return configuration3;
    }

    public void setConfiguration3(String configuration3) {
        this.configuration3 = configuration3;
    }

    public String getConfiguration4() {
        return configuration4;
    }

    public void setConfiguration4(String configuration4) {
        this.configuration4 = configuration4;
    }

    public String getConfiguration5() {
        return configuration5;
    }

    public void setConfiguration5(String configuration5) {
        this.configuration5 = configuration5;
    }

    public String getConfiguration6() {
        return configuration6;
    }

    public void setConfiguration6(String configuration6) {
        this.configuration6 = configuration6;
    }

    public String getConfiguration7() {
        return configuration7;
    }

    public void setConfiguration7(String configuration7) {
        this.configuration7 = configuration7;
    }

    public String getConfiguration8() {
        return configuration8;
    }

    public void setConfiguration8(String configuration8) {
        this.configuration8 = configuration8;
    }

    public ApprovedModel(String id, String device, String number, String imei, String light, String speaker, String antenna, String time, String configuration1, String configuration2, String configuration3, String configuration4, String configuration5, String configuration6, String configuration7, String configuration8, String lightreview, String speakerreview, String antennareview) {
        this.id = id;
        this.device = device;
        this.number = number;
        this.imei = imei;
        this.light = light;
        this.speaker = speaker;
        this.antenna = antenna;
        this.time = time;
        this.configuration1 = configuration1;
        this.configuration2 = configuration2;
        this.configuration3 = configuration3;
        this.configuration4 = configuration4;
        this.configuration5 = configuration5;
        this.configuration6 = configuration6;
        this.configuration7 = configuration7;
        this.configuration8 = configuration8;
        this.lightreview = lightreview;
        this.speakerreview = speakerreview;
        this.antennareview = antennareview;
    }
}
