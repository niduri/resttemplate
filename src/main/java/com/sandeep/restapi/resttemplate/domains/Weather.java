
package com.sandeep.restapi.resttemplate.domains;

import java.io.Serializable;

public class Weather implements Serializable
{

    private Integer id;
    private String main;
    private String description;
    private String icon;
    private final static long serialVersionUID = -2529589417992828825L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}
