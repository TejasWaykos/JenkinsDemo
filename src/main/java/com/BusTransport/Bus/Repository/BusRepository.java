package com.BusTransport.Bus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BusTransport.Bus.Entity.BusEntity;

@Repository
public interface BusRepository extends JpaRepository<BusEntity,Integer>{

	BusEntity getById(int busId);
}
