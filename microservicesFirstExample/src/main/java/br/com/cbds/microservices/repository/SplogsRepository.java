package br.com.cbds.microservices.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cbds.microservices.model.Splogs;

@Repository
public interface SplogsRepository extends CrudRepository<Splogs, Integer>{

}


