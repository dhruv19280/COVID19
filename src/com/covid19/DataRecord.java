package com.covid19;

import java.time.LocalDate;

public class DataRecord {

    private LocalDate dtObservationDate;
    private String sState;
    private Integer iTested;
    private Integer iConfirmed;
    private Integer iRecovered;
    private Integer iDeaths;
    private Integer iActive;

    public LocalDate getDtObservationDate() {
        return dtObservationDate;
    }

    public void setDtObservationDate(LocalDate dtObservationDate) {
        this.dtObservationDate = dtObservationDate;
    }

    public String getsState() {
        return sState;
    }

    public void setsState(String sState) {
        this.sState = sState;
    }

    public Integer getiTested() {
        return iTested;
    }

    public void setiTested(Integer iTested) {
        this.iTested = iTested;
    }

    public Integer getiConfirmed() {
        return iConfirmed;
    }

    public void setiConfirmed(Integer iConfirmed) {
        this.iConfirmed = iConfirmed;
    }

    public Integer getiRecovered() {
        return iRecovered;
    }

    public void setiRecovered(Integer iRecovered) {
        this.iRecovered = iRecovered;
    }

    public Integer getiDeaths() {
        return iDeaths;
    }

    public void setiDeaths(Integer iDeaths) {
        this.iDeaths = iDeaths;
    }

    public Integer getiActive() {
        return iActive;
    }

    public void setiActive(Integer iActive) {
        this.iActive = iActive;
    }
}
