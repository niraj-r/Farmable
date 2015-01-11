package com.niraj.tester;

/**
 * Created by niraj on 1/10/15.
 */
public class PlantInfo {
    private String scientificName;
    private String commonName; // The common name of the plant. This is what functions as the key used for search.
    private int lifespan; // Lifespan of the plant in months
    private int minTemperature; // The minimum temperature required for this plant, in Celsius
    private int maxTemperature; // The maximum temperature the plant can withstand. Also in Celsius
    private int lightTime; // Ideal hours of sunlight for the plant
    private String lightIntensity; // Ideal amount of light for a plant, in Lumens
    private double pH; // The ideal pH of the soil
    private int waterAmount; // The ideal amount of water in mL

    //Getters and setters for the fields of the plant profile class

    void setScientificName(String name){
        scientificName = name;
    }

    void setCommonName(String name){
        commonName = name;
    }

    void setLifespan(int span){
        lifespan = span;
    }

    void setTemperature(int min, int max){
        minTemperature = min;
        maxTemperature = max;
    }

    void setLightTime(int time){
        lightTime = time;
    }

    void setLightIntensity(String intensity){
        lightIntensity = intensity;
    }

    void setpH(double pH){
        this.pH = pH;
    }

    void setWaterAmount(int waterAmount){
        this.waterAmount = waterAmount;
    }

    String getScientificName(){
        return scientificName;
    }

    String getCommonName(){
        return commonName;
    }

    int getLifespan(){
        return lifespan;
    }

    int getMinimumTemperature(){
        return minTemperature;
    }

    int getMaximumTemperature(){
        return maxTemperature;
    }

    int getLightTime(){
        return lightTime;
    }

    String getLightIntensity(){
        return lightIntensity;
    }

    double getpH(){
        return pH;
    }

    int getWaterAmount(){
        return waterAmount;
    }

    // A method that prints out plant information formatted
    void printPlant(){
        System.out.println("Scientific Name: " + scientificName);
        System.out.println("Common Name: " + commonName);
        System.out.println("Lifespan: " + lifespan + " months");
        System.out.println("Temperature Range: " + minTemperature + "-" + maxTemperature + " Celsius");
        System.out.println("Time spent in light: " + lightTime + " hours");
        System.out.println("Intensity of light: " + lightIntensity);
        System.out.println("pH of soil: " + pH);
        System.out.println("Amount of water: " + waterAmount + " mL");

    }


}
