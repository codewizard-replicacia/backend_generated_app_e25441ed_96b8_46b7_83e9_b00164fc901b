package com.mycompany.group234.repository;


import com.mycompany.group234.model.ProducerRaiseFunds;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ProducerRaiseFundsRepository extends SimpleJpaRepository<ProducerRaiseFunds, String> {
    private final EntityManager em;
    public ProducerRaiseFundsRepository(EntityManager em) {
        super(ProducerRaiseFunds.class, em);
        this.em = em;
    }
    @Override
    public List<ProducerRaiseFunds> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"ProducerRaiseFunds\"", ProducerRaiseFunds.class).getResultList();
    }
}