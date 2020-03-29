package pl.rsjava.countriesdocker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.rsjava.countriesdocker.model.CountryLanguage;
import pl.rsjava.countriesdocker.repository.CountryLanguageRepository;

import java.util.List;

@Service
public class CountryLanguageService {

    private CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public List<CountryLanguage> getCountryLanguages(String countryCode) {

        return countryLanguageRepository.findByCountryCode(countryCode);
    }
}
