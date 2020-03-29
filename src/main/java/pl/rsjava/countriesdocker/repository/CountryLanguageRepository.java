package pl.rsjava.countriesdocker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.rsjava.countriesdocker.model.CountryLanguage;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, Long> {

    List<CountryLanguage> findByCountryCode(String countryCode);

}
