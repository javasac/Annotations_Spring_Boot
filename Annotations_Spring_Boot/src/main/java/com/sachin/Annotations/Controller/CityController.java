package com.sachin.Annotations.Controller;
import com.sachin.Annotations.entity.City;
import com.sachin.Annotations.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController
{
    @Autowired
    private CityService cityService;

    @GetMapping("/country/{cod}")
    public List<City> allCitiesCountry(@PathVariable String cod)
    {
        return cityService.allCitiesCountry(cod);
    }

    @GetMapping("/all")
    public List<City> allCities()
    {
        return cityService.allCities();
    }

    @GetMapping("/{id}")
    public City getCityID(@PathVariable String id)
    {
        return cityService.findByID(id);
    }
}
