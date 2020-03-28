package pl.rsjava.countriesdocker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.rsjava.countriesdocker.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

    Country findByCode(String code);

}
