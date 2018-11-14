package br.com.cbds.microservices.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cbds.microservices.model.Player;
import br.com.cbds.microservices.model.Team;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

	public List<Player> findByTeam(Team team);

}
