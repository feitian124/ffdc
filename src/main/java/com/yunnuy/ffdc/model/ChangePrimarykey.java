package com.yunnuy.ffdc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ChangePrimarykey implements Serializable {

	private static final long serialVersionUID = -3814944768177691460L;

	private int id;
	
	private String fullname;
	
	private Date changeDate;
}
