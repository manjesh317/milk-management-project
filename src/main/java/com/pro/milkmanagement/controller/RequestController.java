package com.pro.milkmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.milkmanagement.entity.Request;
import com.pro.milkmanagement.service.RequestService;

@RestController
@RequestMapping("milk")
public class RequestController {
	@Autowired
	public RequestService requestService;
	
	
	
	@GetMapping("/request")
	public List<Request> getRequests() {
		return requestService.getRequests(); 
	}
	
	@GetMapping("/request/{id}")
	public Optional<Request> getRequest(@PathVariable Long id) {
		return requestService.getRequest(id); 
	}
	
	@PostMapping("/request")
	public void createRequest(@RequestBody Request request) {
		requestService.createRequest(request);
	}
	
	@PutMapping("/request/{id}")
	public Request updateRequest(@PathVariable Long id, @RequestBody Request request) {
		request.setId(id);
		return requestService.updateRequest(request);
	}
	
	@DeleteMapping("/request/{id}")
	public void removeRequest(@PathVariable Long id) {
		requestService.removeRequest(id);
	}

}
