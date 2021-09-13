package com.BusTransport.Bus.controller;

import java.util.List;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.BusTransport.Bus.DTO.BusDTO;
import com.BusTransport.Bus.Entity.BusEntity;
import com.BusTransport.Bus.service.BusService;

@RestController
public class BusController {

	@Autowired
	BusService busService;
	
	@GetMapping("/start")
	public List<BusEntity> getAllBus() {
		return busService.getAllBus();
	}
	
	@GetMapping("/start/{busId}")
	public BusDTO AlllBuses(@PathVariable int busId) {
		return busService.getSpecificBus(busId);
	}
}
