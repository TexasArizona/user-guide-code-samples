package com.company.sakila.db0.sakila.city.generated;

import com.company.sakila.db0.sakila.city.City;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.db0.sakila.city.City} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCityManager extends Manager<City> {
    
    TableIdentifier<City> IDENTIFIER = TableIdentifier.of("db0", "sakila", "city");
    List<Field<City>> FIELDS = unmodifiableList(asList(
        City.CITY_ID,
        City.CITY,
        City.COUNTRY_ID,
        City.LAST_UPDATE
    ));
    
    @Override
    default Class<City> getEntityClass() {
        return City.class;
    }
}