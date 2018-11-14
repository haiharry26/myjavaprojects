package br.com.cbds.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.cbds.microservices.model.Player;
import br.com.cbds.microservices.service.PlayerService;

@RestController
@RequestMapping(value = "soccer/")
public class PlayerServiceController {

	@Autowired
	private PlayerService playerService;

	@RequestMapping(value = "/team/{teamId}", method = RequestMethod.GET)
	public Iterable<Player> getPlayersByTeam(@PathVariable("teamId") Integer teamId) {
		return playerService.getPlayersByTeam(teamId);
	}

	@RequestMapping(value = "/player/{playerId}", method = RequestMethod.GET)
	public Player getPlayer(@PathVariable("playerId") Integer playerId) {
		return playerService.getPlayer(playerId);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void savePlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
	}

	@RequestMapping(value = "/delete/{playerId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePlayer(@PathVariable("playerId") Integer playerId) {
		playerService.deletePlayer(new Player(playerId));
	}

}
