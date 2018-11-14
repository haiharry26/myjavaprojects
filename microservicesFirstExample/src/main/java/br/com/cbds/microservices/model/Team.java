package br.com.cbds.microservices.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "team_id", nullable = false)
	private Integer teamId;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "country", nullable = false)
	private String country;

	public Team() {
		super();
	}

	public Team(final Integer teamId) {
		this.teamId = teamId;
	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
