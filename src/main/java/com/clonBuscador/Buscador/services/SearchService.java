package com.clonBuscador.Buscador.services;

import com.clonBuscador.Buscador.entities.WebPage;
import com.clonBuscador.Buscador.repositories.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SearchRepository searchRepository;
    public List<WebPage> search(String textSearch){
        return searchRepository.search(textSearch);
    }
}
