package com.mycompany.group234.repository;


import com.mycompany.group234.model.PreProduction;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PreProductionRepository extends SimpleJpaRepository<PreProduction, String> {
    private final EntityManager em;
    public PreProductionRepository(EntityManager em) {
        super(PreProduction.class, em);
        this.em = em;
    }
    @Override
    public List<PreProduction> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"PreProduction\"", PreProduction.class).getResultList();
    }
}