package com.location.services;

import java.util.List;

import com.location.entities.Location;

public interface LocationService {
	public void saveLocation(Location location);

	public List<Location>getLeads();

	public void deleteLocation(int id);

	public Location getOneLocation(int id);
}
