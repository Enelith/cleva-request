package fr.entoria.cleva.request.repositories.custom.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.util.CollectionUtils;

import fr.entoria.cleva.request.entities.FPolices;
import fr.entoria.cleva.request.repositories.custom.FPolicesCustomRepository;

public class FPolicesCustomRepositoryImpl implements FPolicesCustomRepository {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<FPolices> retrievePolicesByPoliciesNumber(Collection<String> policiesNumber) {
	CriteriaBuilder cb = entityManager.getCriteriaBuilder();

	CriteriaQuery<FPolices> query = cb.createQuery(FPolices.class);
	Root<FPolices> policies = query.from(FPolices.class);

	Path<String> pnPath = policies.get("policyNumber");
	
	List<Predicate> predicates = new ArrayList<>();
	for (String policy : policiesNumber) {
	    predicates.add(cb.like(pnPath, policy));
	}

	if (!CollectionUtils.isEmpty(predicates)) {
	    query.select(policies)
			.where(cb.or(predicates.toArray(new Predicate[predicates.size()])));

	    return entityManager.createQuery(query)
			.getResultList();
	}
	
	return new ArrayList<>();
    }
}
