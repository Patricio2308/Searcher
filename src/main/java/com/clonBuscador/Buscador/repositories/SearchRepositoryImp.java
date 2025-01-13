package com.clonBuscador.Buscador.repositories;

import com.clonBuscador.Buscador.entities.WebPage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SearchRepositoryImp implements SearchRepository{
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<WebPage> search(String textSearch) {
        String query = "FROM WebPage WHERE description like :textSearch";
        return entityManager.createQuery(query)
                .setParameter("textSearch", "%"+ textSearch +"%")
                .getResultList();
    }
}
