package com.mycompany.group234.repository;


import com.mycompany.group234.model.ProductionActualFilming;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ProductionActualFilmingRepository extends SimpleJpaRepository<ProductionActualFilming, String> {
    private final EntityManager em;
    public ProductionActualFilmingRepository(EntityManager em) {
        super(ProductionActualFilming.class, em);
        this.em = em;
    }
    @Override
    public List<ProductionActualFilming> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"ProductionActualFilming\"", ProductionActualFilming.class).getResultList();
    }
}