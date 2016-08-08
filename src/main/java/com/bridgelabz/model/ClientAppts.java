package com.bridgelabz.model;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class ClientAppts {

	
	int client_id;
	String name;
	Appointment Appointment;
	
	/*@OneToMany(mappedBy = "clientAppt", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY, targetEntity = Appointment.class)
	private Collection<Date> appointments;*/

	@Column
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	@OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	public Appointment getAppointment() {
		return Appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.Appointment = appointment;
	}


	/*public Collection<Date> getAppointments() {
		return appointments;
	}

	public void setAppointments(Collection<Date> appointments) {
		this.appointments = appointments;
	}*/
	
	
}
