package com.company.sakila.db0.sakila.film.generated;

import com.company.sakila.db0.sakila.film.Film;
import com.company.sakila.db0.sakila.language.Language;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.db0.sakila.film.Film}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmImpl implements Film {
    
    private int filmId;
    private String title;
    private String description;
    private Date releaseYear;
    private short languageId;
    private Short originalLanguageId;
    private short rentalDuration;
    private BigDecimal rentalRate;
    private Integer length;
    private BigDecimal replacementCost;
    private String rating;
    private String specialFeatures;
    private Timestamp lastUpdate;
    
    protected GeneratedFilmImpl() {}
    
    @Override
    public int getFilmId() {
        return filmId;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
    
    @Override
    public Optional<Date> getReleaseYear() {
        return Optional.ofNullable(releaseYear);
    }
    
    @Override
    public short getLanguageId() {
        return languageId;
    }
    
    @Override
    public Optional<Short> getOriginalLanguageId() {
        return Optional.ofNullable(originalLanguageId);
    }
    
    @Override
    public short getRentalDuration() {
        return rentalDuration;
    }
    
    @Override
    public BigDecimal getRentalRate() {
        return rentalRate;
    }
    
    @Override
    public OptionalInt getLength() {
        return OptionalUtil.ofNullable(length);
    }
    
    @Override
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }
    
    @Override
    public Optional<String> getRating() {
        return Optional.ofNullable(rating);
    }
    
    @Override
    public Optional<String> getSpecialFeatures() {
        return Optional.ofNullable(specialFeatures);
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Film setFilmId(int filmId) {
        this.filmId = filmId;
        return this;
    }
    
    @Override
    public Film setTitle(String title) {
        this.title = title;
        return this;
    }
    
    @Override
    public Film setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public Film setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }
    
    @Override
    public Film setLanguageId(short languageId) {
        this.languageId = languageId;
        return this;
    }
    
    @Override
    public Film setOriginalLanguageId(Short originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
        return this;
    }
    
    @Override
    public Film setRentalDuration(short rentalDuration) {
        this.rentalDuration = rentalDuration;
        return this;
    }
    
    @Override
    public Film setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
        return this;
    }
    
    @Override
    public Film setLength(Integer length) {
        this.length = length;
        return this;
    }
    
    @Override
    public Film setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
        return this;
    }
    
    @Override
    public Film setRating(String rating) {
        this.rating = rating;
        return this;
    }
    
    @Override
    public Film setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
        return this;
    }
    
    @Override
    public Film setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Language findLanguageId(Manager<Language> foreignManager) {
        return foreignManager.stream().filter(Language.LANGUAGE_ID.equal(getLanguageId())).findAny().orElse(null);
    }
    
    @Override
    public Optional<Language> findOriginalLanguageId(Manager<Language> foreignManager) {
        if (getOriginalLanguageId().isPresent()) {
            return foreignManager.stream().filter(Language.LANGUAGE_ID.equal(getOriginalLanguageId().get())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("filmId = "             + Objects.toString(getFilmId()));
        sj.add("title = "              + Objects.toString(getTitle()));
        sj.add("description = "        + Objects.toString(OptionalUtil.unwrap(getDescription())));
        sj.add("releaseYear = "        + Objects.toString(OptionalUtil.unwrap(getReleaseYear())));
        sj.add("languageId = "         + Objects.toString(getLanguageId()));
        sj.add("originalLanguageId = " + Objects.toString(OptionalUtil.unwrap(getOriginalLanguageId())));
        sj.add("rentalDuration = "     + Objects.toString(getRentalDuration()));
        sj.add("rentalRate = "         + Objects.toString(getRentalRate()));
        sj.add("length = "             + Objects.toString(OptionalUtil.unwrap(getLength())));
        sj.add("replacementCost = "    + Objects.toString(getReplacementCost()));
        sj.add("rating = "             + Objects.toString(OptionalUtil.unwrap(getRating())));
        sj.add("specialFeatures = "    + Objects.toString(OptionalUtil.unwrap(getSpecialFeatures())));
        sj.add("lastUpdate = "         + Objects.toString(getLastUpdate()));
        return "FilmImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Film)) { return false; }
        final Film thatFilm = (Film)that;
        if (this.getFilmId() != thatFilm.getFilmId()) { return false; }
        if (!Objects.equals(this.getTitle(), thatFilm.getTitle())) { return false; }
        if (!Objects.equals(this.getDescription(), thatFilm.getDescription())) { return false; }
        if (!Objects.equals(this.getReleaseYear(), thatFilm.getReleaseYear())) { return false; }
        if (this.getLanguageId() != thatFilm.getLanguageId()) { return false; }
        if (!Objects.equals(this.getOriginalLanguageId(), thatFilm.getOriginalLanguageId())) { return false; }
        if (this.getRentalDuration() != thatFilm.getRentalDuration()) { return false; }
        if (!Objects.equals(this.getRentalRate(), thatFilm.getRentalRate())) { return false; }
        if (!Objects.equals(this.getLength(), thatFilm.getLength())) { return false; }
        if (!Objects.equals(this.getReplacementCost(), thatFilm.getReplacementCost())) { return false; }
        if (!Objects.equals(this.getRating(), thatFilm.getRating())) { return false; }
        if (!Objects.equals(this.getSpecialFeatures(), thatFilm.getSpecialFeatures())) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatFilm.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getFilmId());
        hash = 31 * hash + Objects.hashCode(getTitle());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getDescription()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getReleaseYear()));
        hash = 31 * hash + Short.hashCode(getLanguageId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getOriginalLanguageId()));
        hash = 31 * hash + Short.hashCode(getRentalDuration());
        hash = 31 * hash + Objects.hashCode(getRentalRate());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getLength()));
        hash = 31 * hash + Objects.hashCode(getReplacementCost());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getRating()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSpecialFeatures()));
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}