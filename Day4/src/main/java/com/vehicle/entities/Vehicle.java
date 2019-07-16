package com.vehicle.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Vehicle {

	/*This is ass 12 - using auto
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO)
	 */
	@Id
	@SequenceGenerator(name = "seqProdNo", sequenceName = "seqProdNo", initialValue = 1000, allocationSize = 10)
	@GeneratedValue(generator = "seqProdNo")

	private int vehicleId;
	private int ownerId;
	private double price;
	private String name;

	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



}
