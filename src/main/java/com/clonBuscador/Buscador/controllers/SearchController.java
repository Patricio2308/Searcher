package com.clonBuscador.Buscador.controllers;

import com.clonBuscador.Buscador.entities.WebPage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    @RequestMapping(value = "api/search", method = RequestMethod.GET)
    public List<WebPage> search(){
        List<WebPage> result = new ArrayList<>();
        WebPage page = new WebPage();
       /* page.setTitle("Title");
        page.setDescription("Description");
        page.setUrl("Url");
        result.add(page);*/
        return result;
    }
}
