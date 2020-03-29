package pl.rsjava.countriesdocker.model;

import java.util.List;

public class CountryApi {

    //    //"name": "Bahrain"
    //    //"continent": "Asia"
    //    //"population":617000
    //    //"life_expectancy":73
    //    //"country_language":"Arabic"

    private String name;
    private String continent;
    private Integer population;
    private Integer lifeExpectancy;
    private String countryLanguage;

    public CountryApi() {
    }

    public CountryApi(String name, String continent, Integer population, Integer lifeExpectancy,
                      String countryLanguage) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.countryLanguage = countryLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Integer lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(String countryLanguage) {
        this.countryLanguage = countryLanguage;
    }
}
