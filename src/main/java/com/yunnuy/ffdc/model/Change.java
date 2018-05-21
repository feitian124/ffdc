package com.yunnuy.ffdc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

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

	public ChangePrimarykey getChangePK() {
		return changePK;
	}

	public void setChangePK(ChangePrimarykey changePK) {
		this.changePK = changePK;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public BigDecimal getRatio() {
		return ratio;
	}

	public void setRatio(BigDecimal ratio) {
		this.ratio = ratio;
	}

}
