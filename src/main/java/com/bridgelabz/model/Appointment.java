package com.bridgelabz.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointment {
	
	int appointment_id;
	String appoientment_type;
	
	/*@ManyToOne(cascade = {CascadeType.ALL})
	private ClientAppts clientAppt;*/

	@Id
	@GeneratedValue
	@Column(name="appoientment_id")
	public int getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}

	@Column
	public String getAppoientment_type() {
		return appoientment_type;
	}

	public void setAppoientment_type(String appoientment_type) {
		this.appoientment_type = appoientment_type;
	}

	/*public ClientAppts getClientAppt() {
		return clientAppt;
	}

	public void setClientAppt(ClientAppts clientAppt) {
		this.clientAppt = clientAppt;
	}*/

}
