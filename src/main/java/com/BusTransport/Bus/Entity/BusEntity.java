package com.BusTransport.Bus.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus")
public class BusEntity {
	
	@Id
	@Column(name="bus_id")
	private int busID;
	
	@Column(name="name")
	private String name;
	
	@Column(name="distance")
	private int distance;
	
	@Column(name="fare")
	private int fare;
	
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="route_id")
	private int routeId;

	public int getBusID() {
		return busID;
	}

	public void setBusID(int busID) {
		this.busID = busID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	@Override
	public String toString() {
		return "BusEntity [busID=" + busID + ", name=" + name + ", distance=" + distance + ", fare=" + fare
				+ ", cityId=" + cityId + ", routeId=" + routeId + "]";
	}

	
}
