package com.example.vivien.mostpopulatedcounties;

import java.io.Serializable;

public class Country implements Serializable{

    private Integer ranking;
    private String name;
    private Integer population;
    private int image;



    public Country(Integer ranking, String name, Integer population, int image){
        this.ranking = ranking;
        this.name = name;
        this.population = population;
        this.image = image;

    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }

    public int getImage() {
        return image;
    }
}
