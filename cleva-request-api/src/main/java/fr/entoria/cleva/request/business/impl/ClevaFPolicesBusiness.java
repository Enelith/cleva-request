package fr.entoria.cleva.request.business.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.entoria.cleva.request.business.IClevaFPolicesBusiness;
import fr.entoria.cleva.request.entities.FPolices;
import fr.entoria.cleva.request.services.IClevaFPolicesService;

@Component
public class ClevaFPolicesBusiness implements IClevaFPolicesBusiness {

    @Autowired
    IClevaFPolicesService clevaFPoliciesService;
    
    @Override
    public List<FPolices> retrievePolicesByPoliciesNumber(Collection<String> policiesNumber) {
	return clevaFPoliciesService.retrievePolicesByPoliciesNumber(policiesNumber);
    }
}
