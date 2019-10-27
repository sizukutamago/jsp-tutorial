package com.Model;

import java.io.Serializable;

public class Health implements Serializable {

    private double height, weight, bmi;

    private String bodyType;

    public Health() {};

    public Health(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void checkHealth() {
        bmi = weight / (height / 100.0 * height / 100.0);

        if (bmi < 18.5) {
            bodyType = "痩せ型";
        } else if (bmi < 25) {
            bodyType = "普通";
        } else {
            bodyType = "肥満";
        }
    }
}
