package fr.entoria.cleva.request.repositories;

import fr.entoria.cleva.request.repositories.custom.FPolicesCustomRepository;
import fr.entoria.cleva.request.repositories.jpa.IFPolicesJpaRepository;

public interface IFPolicesRepository extends IFPolicesJpaRepository, FPolicesCustomRepository {
    
}
