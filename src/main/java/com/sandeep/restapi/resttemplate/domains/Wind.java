
package com.sandeep.restapi.resttemplate.domains;

import java.io.Serializable;

public class Wind implements Serializable
{

    private Float speed;
    private Integer deg;
    private final static long serialVersionUID = -7138760837510001397L;

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

}
