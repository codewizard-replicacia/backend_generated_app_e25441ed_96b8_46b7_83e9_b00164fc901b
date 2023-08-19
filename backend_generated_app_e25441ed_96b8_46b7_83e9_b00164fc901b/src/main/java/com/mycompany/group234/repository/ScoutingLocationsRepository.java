package com.mycompany.group234.repository;


import com.mycompany.group234.model.ScoutingLocations;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ScoutingLocationsRepository extends SimpleJpaRepository<ScoutingLocations, String> {
    private final EntityManager em;
    public ScoutingLocationsRepository(EntityManager em) {
        super(ScoutingLocations.class, em);
        this.em = em;
    }
    @Override
    public List<ScoutingLocations> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"ScoutingLocations\"", ScoutingLocations.class).getResultList();
    }
}