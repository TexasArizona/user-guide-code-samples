package com.company.sakila.db0.sakila.film.generated;

import com.company.sakila.db0.sakila.film.Film;
import com.company.sakila.db0.sakila.film.FilmImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.company.sakila.db0.sakila.film.Film} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmSqlAdapter implements SqlAdapter<Film> {
    
    private final TableIdentifier<Film> tableIdentifier;
    
    protected GeneratedFilmSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("db0", "sakila", "film");
    }
    
    protected Film apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setFilmId(             resultSet.getInt(1 + offset))
            .setTitle(              resultSet.getString(2 + offset))
            .setDescription(        resultSet.getString(3 + offset))
            .setReleaseYear(        resultSet.getDate(4 + offset))
            .setLanguageId(         resultSet.getShort(5 + offset))
            .setOriginalLanguageId( getShort(resultSet, 6 + offset))
            .setRentalDuration(     resultSet.getShort(7 + offset))
            .setRentalRate(         resultSet.getBigDecimal(8 + offset))
            .setLength(             getInt(resultSet, 9 + offset))
            .setReplacementCost(    resultSet.getBigDecimal(10 + offset))
            .setRating(             resultSet.getString(11 + offset))
            .setSpecialFeatures(    resultSet.getString(12 + offset))
            .setLastUpdate(         resultSet.getTimestamp(13 + offset))
            ;
    }
    
    protected FilmImpl createEntity() {
        return new FilmImpl();
    }
    
    @Override
    public TableIdentifier<Film> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Film> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Film> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}