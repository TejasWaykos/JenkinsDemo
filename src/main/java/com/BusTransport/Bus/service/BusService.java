package com.BusTransport.Bus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BusTransport.Bus.DTO.BusDTO;
import com.BusTransport.Bus.Entity.BusEntity;
import com.BusTransport.Bus.Repository.BusRepository;
import com.BusTransport.Bus.service.Exception.UserNotFoundException;

@Service
public class BusService {

	@Autowired
	BusRepository busRepository;
	
	public List<BusEntity> getAllBus() {
		return busRepository.findAll();
	}
	public BusDTO getSpecificBus(int busId) {
		BusEntity busEntity=busRepository.getById(busId);
		if(busEntity==null) {
			throw new UserNotFoundException("id-"+busId);
		}
		BusDTO busDTO=BusDTO.valueOf(busEntity);
		
		return busDTO;
		
	}
}
