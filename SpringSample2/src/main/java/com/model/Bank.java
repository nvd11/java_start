package com.model;

import java.io.Serializable;
import org.apache.commons.scxml.model.SCXML;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import static javax.persistence.GenerationType.*;

@Entity
@Table(name = "BANK")
public class Bank implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_bank_id")
	@SequenceGenerator(name="seq_bank_id", sequenceName = "SEQ_BANK")
	@Column(name="ID")
	private int id;
	private String name;
	private String description;
	private SCXML scxml;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public SCXML getScxml() {
		return scxml;
	}

	public void setScxml(SCXML scxml) {
		this.scxml = scxml;
	}
	
}
