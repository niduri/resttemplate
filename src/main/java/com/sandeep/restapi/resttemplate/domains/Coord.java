
package com.sandeep.restapi.resttemplate.domains;

import java.io.Serializable;

public class Coord implements Serializable
{

    private Float lon;
    private Float lat;
    private final static long serialVersionUID = -7721282811932519156L;

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

}
