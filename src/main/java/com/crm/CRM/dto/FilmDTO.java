package com.crm.CRM.dto;

import com.crm.CRM.entity.Country;
import com.crm.CRM.entity.Genre;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmDTO implements Serializable {
    private static final long serialVersionUID = 1L;
// author не делаем, нужно в entity сделать genre, у одного фильма их может быть несколько
// на постер присваивается не объект-картинка, а url
    private String nameRu;
    private Integer year;
    private Double ratingImdb;
    private String posterUrl;
    private String description;

    @JsonProperty("genres")
    private List<Genre> genres;

    @JsonProperty("genres")
    private List<Country> countries;
}
