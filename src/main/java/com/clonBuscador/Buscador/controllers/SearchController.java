package com.clonBuscador.Buscador.controllers;

import com.clonBuscador.Buscador.entities.WebPage;
import com.clonBuscador.Buscador.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController {
    @Autowired
    private SearchService service;

    @CrossOrigin("*")
    @RequestMapping(value = "api/search", method = RequestMethod.GET)
    public List<WebPage> search(@RequestParam Map<String, String> param){
        //api/search?query=Busqueda&lang=en
        String query = param.get("query");
        return service.search(query);
    }
}
