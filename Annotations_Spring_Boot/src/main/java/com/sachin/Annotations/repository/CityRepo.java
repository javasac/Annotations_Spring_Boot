package com.sachin.Annotations.repository;
import com.sachin.Annotations.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CityRepo extends JpaRepository<City, String>
{
    @Query(value = "select * FROM world.city where country = :code", nativeQuery = true)
    List<City> getAllCitiesCountry(@Param("code") String code);
}
