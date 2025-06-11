package com.crm.CRM.entity;

import com.crm.CRM.entity.Genre;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Film {
    //Я на самом деле вообще хз как сюда добавить данр и страну, если знаешь, то напишм и потом пуш заебашь
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private Integer year;
    private Double rating;
    private String poster;
    private String description;
}
