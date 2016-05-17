package com.kstrata.apps.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the holidays database table.
 * 
 */
@Entity
@Table(name="holidays")
@NamedQuery(name="Holiday.findAll", query="SELECT h FROM Holiday h")
public class Holiday implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1245715302087796423L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(nullable=false, length=100)
	private String name;

	@Column(length=1)
	@org.hibernate.annotations.Type(type = "yes_no")
	private boolean status;

	public Holiday() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}