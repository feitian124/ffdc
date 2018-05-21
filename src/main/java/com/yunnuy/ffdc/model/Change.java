package com.yunnuy.ffdc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "shareholder_changes")
public class Change implements Serializable {

	private static final long serialVersionUID = 8887281435699168895L;
	
	@EmbeddedId
	private ChangePrimarykey changePK;
	
//	private int id;
	
//	private String fullname;
	
	private String shortname;
	
//	private Date changeDate;
	
	private BigDecimal price;
	
	private int quantity;
	
	private int total;
	
	private BigDecimal ratio;

}
