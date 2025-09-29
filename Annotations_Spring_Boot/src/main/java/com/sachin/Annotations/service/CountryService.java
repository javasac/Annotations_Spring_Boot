package com.sachin.Annotations.service;
import com.sachin.Annotations.entity.Countries;
import com.sachin.Annotations.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService
{
    @Autowired
    private CountryRepo countryRepo;

    public List<Countries> getAllCountries()
    {
        return countryRepo.findAll();
    }
}
