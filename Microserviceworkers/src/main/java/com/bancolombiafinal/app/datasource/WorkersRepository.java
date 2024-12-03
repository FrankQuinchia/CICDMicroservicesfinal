package com.bancolombiafinal.app.datasource;

import org.springframework.stereotype.Component;

import com.bancolombiafinal.app.entities.workers;
import java.util.List;
import java.util.ArrayList;


@Component
public class WorkersRepository {
	private final List<workers> Lista=new ArrayList<>();
	
	public boolean insert(workers item) {
		return Lista.add(item);
	}

	public List<workers> getALL() {
		return Lista;
	}
	
	
}
