package com.sachin.Annotations.Controller;
import com.sachin.Annotations.entity.Countries;
import com.sachin.Annotations.service.CountryService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController
{
    @Autowired
    private CountryService countryService;

    @Autowired
    EntityManagerFactory factory;

    @GetMapping("/em/{co}")
    public Countries getCountry(@PathVariable String co)
    {
        System.out.println("CountryController -> getCountry -> " + co);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        Countries country = em.find(Countries.class, co);
        //System.out.println(country.getCode() + ", " + country.getName() + ", " + country.getContinent());

        em.getTransaction().commit();
        em.close();

        return country;
    }

    @GetMapping("/all")
    public List<Countries> getAllCountries()
    {
        return countryService.getAllCountries();
    }

    @GetMapping("/{code}")
    public Countries getCountryByCode(@PathVariable String code)
    {
        return countryService.getCountry(code);
    }
}
