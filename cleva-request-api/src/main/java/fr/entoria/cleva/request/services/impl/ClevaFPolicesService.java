package fr.entoria.cleva.request.services.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.entoria.cleva.request.entities.FPolices;
import fr.entoria.cleva.request.repositories.IFPolicesRepository;
import fr.entoria.cleva.request.services.IClevaFPolicesService;

@Service
public class ClevaFPolicesService implements IClevaFPolicesService {
    
    @Autowired
    IFPolicesRepository fpolicesRepository;

    @Override
    public List<FPolices> retrievePolicesByPoliciesNumber(Collection<String> policiesNumber) {
	return fpolicesRepository.retrievePolicesByPoliciesNumber(policiesNumber);
    }
}
