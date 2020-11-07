package fr.entoria.cleva.request.services;

import java.util.Collection;
import java.util.List;

import fr.entoria.cleva.request.entities.FPolices;

public interface IClevaFPolicesService {
    public List<FPolices> retrievePolicesByPoliciesNumber(Collection<String> policiesNumber);
}
