package br.com.fiap.dao;


import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;

import br.com.fiap.model.VisitanteModel;


public class VisitanteDao {

    @Inject
    private EntityManager em;


    public void create(VisitanteModel visitante) {
        em.getTransaction().begin();
        em.persist(visitante);
        em.getTransaction().commit();
        em.clear();
    }

    public List<VisitanteModel> listAll() {
        TypedQuery<VisitanteModel> query = 
                em.createQuery("SELECT v FROM Visitante v", VisitanteModel.class);
        return query.getResultList();
    }


}
