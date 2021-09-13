package com.BusTransport.Bus.DTO;

import javax.persistence.Column;

import com.BusTransport.Bus.Entity.BusEntity;

public class BusDTO {
	private int busID;
	
	private String name;
	
	private int distance;
	
	private int fare;

	private int cityId;
	
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
	
	public static BusDTO valueOf(BusEntity busEntity) {
		BusDTO busDTO=new BusDTO();
		
		busDTO.setBusID(busEntity.getBusID());
		busDTO.setName(busEntity.getName());
		busDTO.setDistance(busEntity.getDistance());
		busDTO.setFare(busEntity.getFare());
		busDTO.setCityId(busEntity.getCityId());
		busDTO.setRouteId(busEntity.getRouteId());
		
		return busDTO;
	}
	
	public BusEntity createEntity() {
		BusEntity bus=new BusEntity();
		
		bus.setBusID(this.getBusID());
		bus.setName(this.getName());
		bus.setDistance(this.getDistance());
		bus.setFare(this.getFare());
		bus.setCityId(this.getCityId());
		bus.setRouteId(this.getRouteId());
		
		return bus;
	}
}
