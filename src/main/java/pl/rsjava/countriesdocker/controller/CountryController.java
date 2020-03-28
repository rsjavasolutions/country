package pl.rsjava.countriesdocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.rsjava.countriesdocker.model.Country;
import pl.rsjava.countriesdocker.model.CountryApi;
import pl.rsjava.countriesdocker.service.CountryService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

@GetMapping("/{code}")
    public CountryApi getCountryInfo(@PathVariable String code){
    Country country = countryService.getCountry(code);

    List<String> list = new ArrayList<>();
    list.add("PL");

    return new CountryApi(
            country.getName(),
            country.getContinent(),
            country.getPopulation(),
            country.getLifeExpectancy(),
            list
    );
}

}
