package com.company.sakila.db0.sakila.country.generated;

import com.company.sakila.db0.sakila.country.Country;
import com.company.sakila.db0.sakila.country.CountryImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.company.sakila.db0.sakila.country.Country} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCountrySqlAdapter implements SqlAdapter<Country> {
    
    private final TableIdentifier<Country> tableIdentifier;
    
    protected GeneratedCountrySqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("db0", "sakila", "country");
    }
    
    protected Country apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setCountryId(  resultSet.getInt(1 + offset))
            .setCountry(    resultSet.getString(2 + offset))
            .setLastUpdate( resultSet.getTimestamp(3 + offset))
            ;
    }
    
    protected CountryImpl createEntity() {
        return new CountryImpl();
    }
    
    @Override
    public TableIdentifier<Country> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Country> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Country> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}