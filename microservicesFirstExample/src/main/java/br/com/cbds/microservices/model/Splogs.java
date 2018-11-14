package br.com.cbds.microservices.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.cbds.microservices.model.DateUtility;

@Entity
@Table(name = "sp_logs_app3")

public class Splogs implements Serializable { 

	private static final long serialVersionUID = 1L;
	
	@JsonInclude()
	//@JsonIgnore
	@Transient
	private String extraField;
		

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id", nullable = false, updatable = false)
	private Integer Id;

	@Column(name = "sp_name_with_input", nullable = false)
	private String sp_name_with_input;

	//@Convert(converter = LocalDateTimeConverter.class)
	//@Column(name = "sp_start_time", nullable = false)
	//private LocalDateTime  sp_start_time;
	
    @Column(name = "sp_start_time", nullable = false)
    @JsonIgnore
	// @Temporal(TemporalType.TIMESTAMP)
	private Timestamp sp_start_time;
    
    
    public Timestamp getSp_start_time() {
    	//extraField = sp_start_time.toString();
		return sp_start_time;
		
	}

    
	public void setSp_start_time(Timestamp sp_start_time) {
		// this.sp_start_time = Timestamp.valueOf(extraField);
		this.sp_start_time = sp_start_time;
	}

	 
	@Transient
	public String getExtraField() {
		extraField = sp_start_time.toString();
		return extraField;
	}

	@Transient
	public void setExtraField(String extraField) {
		sp_start_time = Timestamp.valueOf(extraField);
		this.extraField = extraField;
	}

		
	@Column(name = "sp_end_time", nullable = false)
	private String sp_end_time;

	@Column(name = "sp_session_id", nullable = false)
	private Integer sp_session_id;
	
	
	
	//String s="2018-10-29 10:11:12";
	//Timestamp currentDatetime1 = Timestamp.valueOf(s);

	
	public Splogs() {
		// dont remove
	}


	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getSp_name_with_input() {
		return sp_name_with_input;
	}

	public void setSp_name_with_input(String sp_name_with_input) {
		this.sp_name_with_input = sp_name_with_input;
	}
	
	public String getSp_end_time() {
		return sp_end_time;
	}

	public void setSp_end_time(String sp_end_time) {
		this.sp_end_time = sp_end_time;
	}

	public Integer getSp_session_id() {
		return sp_session_id;
	}

	public void setSp_session_id(Integer sp_session_id) {
		this.sp_session_id = sp_session_id;
	}
	

}
