package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.entities.Location;
import com.location.services.LocationService;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationService; 
	
	// http://localhost:8080/view
	@RequestMapping("/view")
	public String viewPage() {
	return "index";
	}
	
	@RequestMapping("/save")
	public String saveLocation(@ModelAttribute("location") Location location, Model model) {
		locationService.saveLocation(location);
		return "index";
		
	}
	@RequestMapping("/listAll")
	public String listAllLeads(Model model) {
		List<Location> location = locationService.getLeads();
		model.addAttribute("location", location);		
		return "ListAll";
	}
	@RequestMapping("/delete")
	public String deleteLocation(@RequestParam("id") int id, Model model) {
		locationService.deleteLocation(id);
		List<Location> location = locationService.getLeads();
		model.addAttribute("location", location);	
		return "ListAll";
	}
	@RequestMapping("/update")
	public String updateLocation(@RequestParam("id") int id , Model model) {
		Location location = locationService.getOneLocation(id);
		model.addAttribute("location", location);
		return"update_location";
	}
	@RequestMapping("/updateLocation")
	public String updateLocation(@ModelAttribute("location")Location l, Model model) {
//	Location location1 = new Location();
//		location1.setId(l.getId());
//		location1.setName(l.getName());
//		location1.setCity(l.getCity());
//		location1.setType(l.getType());
		l.setId(l.getId());
		l.setName(l.getName());
		l.setCity(l.getCity());
		l.setType(l.getType());
		locationService.saveLocation(l);
		List<Location> location = locationService.getLeads();
		model.addAttribute("location", location);		
		return "ListAll";
	}
	
}
