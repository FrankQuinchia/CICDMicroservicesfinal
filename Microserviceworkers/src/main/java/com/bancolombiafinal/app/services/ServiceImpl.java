package com.bancolombiafinal.app.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bancolombiafinal.app.entities.workers;

import com.bancolombiafinal.app.datasource.WorkersRepository;


@Service
public class ServiceImpl implements IService {
	
	@Autowired
	private WorkersRepository repositorio;

	@Override
	public boolean insert(workers item) {
		return repositorio.insert(item);
	}

	@Override
	public List<workers> getALL() {
		return repositorio.getALL();
	}

}
