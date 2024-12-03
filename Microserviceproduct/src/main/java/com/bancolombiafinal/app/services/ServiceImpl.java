package com.bancolombiafinal.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bancolombiafinal.app.datasource.ProductRepository;
import com.bancolombiafinal.app.entities.Product;

import org.springframework.beans.factory.annotation.Autowired;



@Service
public class ServiceImpl implements IService {
	@Autowired
	private ProductRepository repositorio;

	@Override
	public boolean insert(Product item) {
		return repositorio.insert(item);
	}

	@Override
	public List<Product> getALL() {
		return repositorio.getALL();
	}

}
