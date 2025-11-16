package com.sachin.Annotations.entity;
import jakarta.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema="world", name="countries",
        uniqueConstraints = {@UniqueConstraint(columnNames = "name")},
        indexes = {@Index(name = "Code_IDX", columnList = "Code, name")}
)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region="countryCache")
//@IdClass(CK_Countries.class)
public class Countries
{
    @Id
    private String Code;
    private String name;

    //@EmbeddedId
    //CK_Countries ck;
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "desh_seq")
    //@SequenceGenerator(name="desh_seq", sequenceName="country_seq", initialValue = 1, allocationSize = 100)

    private String continent;
    private String region;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cities = new ArrayList<>();

    public List<City> getCities()
    {
        return cities;
    }

    public void setCities(List<City> cities)
    {
        this.cities = cities;
    }

    public String getCode()
    {
        return Code;
    }

    public void setCode(String code)
    {
        Code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getContinent()
    {
        return continent;
    }

    public void setContinent(String continent)
    {
        this.continent = continent;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }
}
