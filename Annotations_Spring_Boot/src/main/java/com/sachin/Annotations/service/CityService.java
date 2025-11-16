package com.sachin.Annotations.service;
import com.sachin.Annotations.entity.City;
import com.sachin.Annotations.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CityService
{
    @Autowired
    private CityRepo cityRepo;

    public List<City> allCitiesCountry(String cod)
    {
        return cityRepo.getAllCitiesCountry(cod);
    }

    public List<City> allCities()
    {
        return cityRepo.findAll();
    }

    public City findByID(String id)
    {
        return cityRepo.findById(id).orElse(null);
    }
}
