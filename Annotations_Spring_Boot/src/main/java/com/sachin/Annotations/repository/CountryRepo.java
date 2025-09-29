package com.sachin.Annotations.repository;
import com.sachin.Annotations.entity.Countries;
import com.sachin.Annotations.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Countries, String>
{

}
