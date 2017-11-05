package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.PlaneFlight;
import com.service.DeploymentService;

@RestController
@RequestMapping("/flights")
public class PlaneController {
	@Autowired
	DeploymentService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<PlaneFlight> getFlights(){
		return getTestData();
	}
	private List<PlaneFlight> getTestData(){
		ArrayList<PlaneFlight> list = new ArrayList<>();
		PlaneFlight a = new PlaneFlight("TW","JP","123");
		PlaneFlight b = new PlaneFlight("TW","bkk","567");
		list.add(a);
		list.add(b);
		return list;
	}
}
