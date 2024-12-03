package com.bancolombiafinal.app.services;

import java.util.List;

import com.bancolombiafinal.app.entities.workers;



public interface IService {

	boolean insert(workers item);
	
	List<workers> getALL();
}
