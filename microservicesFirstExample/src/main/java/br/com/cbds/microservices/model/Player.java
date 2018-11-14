package br.com.cbds.microservices.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "player_id", nullable = false)
	private Integer playerId;

	@ManyToOne
	@JoinColumn(name = "team_id", nullable = false)
	private Team team;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "shirt_number", nullable = false)
	private Integer shirtNumber;

	@Column(name = "position", nullable = false)
	private String position;

	public Player() {
		// dont remove
	}

	public Player(Integer playerId) {
		super();
		this.playerId = playerId;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(Integer shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
