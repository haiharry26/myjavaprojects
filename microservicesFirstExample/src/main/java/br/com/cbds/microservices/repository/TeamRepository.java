package br.com.cbds.microservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cbds.microservices.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Integer> {

}
