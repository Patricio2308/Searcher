package com.clonBuscador.Buscador.repositories;

import com.clonBuscador.Buscador.entities.WebPage;

import java.util.List;

public interface SearchRepository {
    List<WebPage> search(String textSearch);
}
