package com.model;

import java.io.Serializable;

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
	private String id;
	private String name;
	private String description;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
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
	
	
	
}
