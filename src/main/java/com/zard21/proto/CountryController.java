package com.zard21.proto;

import com.zard21.model.proto.CountryModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/countries/{id}")
    CountryModels.Country getCountry(@PathVariable Integer id) {
        System.out.println(countryRepository.getCountry(id).getId());
        System.out.println(countryRepository.getCountry(id).getName());
        System.out.println(countryRepository.getCountry(id).getStatus());

        return countryRepository.getCountry(id);
    }
}
