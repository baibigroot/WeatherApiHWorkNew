package com.example.weatherapihworknew.data;

import com.google.gson.annotations.SerializedName;

public class WeatherModel {
    @SerializedName("cod")
    private Integer code;

    @SerializedName("temp")
    private Double temp;

    @SerializedName("pressure")
    private Integer pressure;

    @SerializedName("humidity")
    private Integer humidity;

    @SerializedName("name")
    private String name;

    @SerializedName("temp_max")
    private Double tempMax;

    @SerializedName("temp_min")
    private Double tempMin;

    public Double getTempMax() {
        return tempMax;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public Integer getCode() {
        return code;
    }

    public Double getTemp() {
        return temp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public String getName() {
        return name;
    }
}
