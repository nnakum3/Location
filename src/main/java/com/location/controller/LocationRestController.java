package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entities.Location;
import com.location.repositories.LocationRepository;

@RestController
@RequestMapping("/location")
public class LocationRestController {

	@Autowired
	private LocationRepository locationRepo;
	
	@GetMapping
	public List<Location> getLocation() {
		List<Location> location = locationRepo.findAll();
		return location;
	}
}
