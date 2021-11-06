package com.github.emmilyrodrigues.citiesapi.countries.repository;

import com.github.emmilyrodrigues.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface countryRepository extends JpaRepository<Country, Long> {
}
