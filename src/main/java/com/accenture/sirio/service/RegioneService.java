package com.accenture.sirio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.sirio.repository.RegioneRepository;

@Service
public class RegioneService {
	@Autowired
	private RegioneRepository regioneRepository;
}
