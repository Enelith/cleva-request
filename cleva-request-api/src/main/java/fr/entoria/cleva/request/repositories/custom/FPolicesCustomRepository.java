package fr.entoria.cleva.request.repositories.custom;

import java.util.Collection;
import java.util.List;

import fr.entoria.cleva.request.entities.FPolices;

public interface FPolicesCustomRepository {
    
    public List<FPolices> retrievePolicesByPoliciesNumber(Collection<String> policiesNumber);
}
