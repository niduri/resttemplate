
package com.sandeep.restapi.resttemplate.domains;

import java.io.Serializable;

public class Main implements Serializable
{

    private Float temp;
    private Integer pressure;
    private Integer humidity;
    private Float tempMin;
    private Float tempMax;
    private final static long serialVersionUID = 2979770591796850434L;

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Float getTempMin() {
        return tempMin;
    }

    public void setTempMin(Float tempMin) {
        this.tempMin = tempMin;
    }

    public Float getTempMax() {
        return tempMax;
    }

    public void setTempMax(Float tempMax) {
        this.tempMax = tempMax;
    }

}
