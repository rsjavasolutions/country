package pl.rsjava.countriesdocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.rsjava.countriesdocker.model.Country;
import pl.rsjava.countriesdocker.model.CountryApi;
import pl.rsjava.countriesdocker.model.CountryLanguage;
import pl.rsjava.countriesdocker.service.CountryLanguageService;
import pl.rsjava.countriesdocker.service.CountryService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryLanguageService countryLanguageService;

    @Autowired
    CountryService countryService;

    @GetMapping("lang/{code}")
    public List<CountryLanguage> getCountryLanguages(@PathVariable String code) {
        return countryLanguageService.getCountryLanguages(code);
    }

    @GetMapping("/{code}")
    public CountryApi getCountryInfo(@PathVariable String code) {
        Country country = countryService.getCountry(code);
        List<CountryLanguage> countryLanguages = countryLanguageService.getCountryLanguages(code);
        String language = null;
        if (countryLanguages.size() != 0){
            language = countryLanguages.get(0).getLanguage();
        }
        return new CountryApi(
                country.getName(),
                country.getContinent(),
                country.getPopulation(),
                country.getLifeExpectancy(),
                language
        );
    }
}
