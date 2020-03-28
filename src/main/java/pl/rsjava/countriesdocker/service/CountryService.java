package pl.rsjava.countriesdocker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.rsjava.countriesdocker.model.Country;
import pl.rsjava.countriesdocker.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public Country getCountry(String code){
        return countryRepository.findByCode(code);
    }


}
