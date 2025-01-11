package com.clonBuscador.Buscador.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "webpage")
@Getter @Setter
@ToString
@EqualsAndHashCode
@Builder
public class WebPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "url")
    private String url;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
}
