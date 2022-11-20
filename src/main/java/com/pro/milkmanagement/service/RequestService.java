package com.pro.milkmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.milkmanagement.entity.Request;
import com.pro.milkmanagement.repository.RequestRepository;

@Service
public class RequestService {
	@Autowired
	public RequestRepository requestRepository;
	
	public List<Request> getRequests() {
		List<Request> requests = requestRepository.findAll();
		for(Request request:requests) {
			System.out.println(request);
		}
		return requests;
	}

	public void createRequest(Request requests) {
		requestRepository.save(requests);
		
	}

	public Optional<Request> getRequest(Long id) {
		return requestRepository.findById(id);
	}
	
	public Request updateRequest(Request requests) {
		return requestRepository.save(requests);
	}

	public void removeRequest(Long id) {
		requestRepository.deleteById(id);		
	}

}
