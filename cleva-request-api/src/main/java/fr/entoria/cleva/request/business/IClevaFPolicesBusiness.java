package fr.entoria.cleva.request.business;

import java.util.Collection;
import java.util.List;

import fr.entoria.cleva.request.entities.FPolices;

public interface IClevaFPolicesBusiness {

    public List<FPolices> retrievePolicesByPoliciesNumber(Collection<String> policiesNumber);
}
