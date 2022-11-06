package com.location.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entities.Location;
import com.location.repositories.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepo;
	
	@Override
	public void saveLocation(Location location) {
		locationRepo.save(location);
	}

	@Override
	public List<Location> getLeads() {
		List<Location> location = locationRepo.findAll();
		return location;
		
	}

	@Override
	public void deleteLocation(int id) {
		locationRepo.deleteById(id);		
	}

	@Override
	public Location getOneLocation(int id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
		
	}


}
