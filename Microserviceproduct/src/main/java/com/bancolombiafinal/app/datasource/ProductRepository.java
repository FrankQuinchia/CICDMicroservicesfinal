package com.bancolombiafinal.app.datasource;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.bancolombiafinal.app.entities.Product;

@Component
public class ProductRepository {
	
	private final List<Product> Lista=new ArrayList<>();
	
	public boolean insert(Product item) {
		return Lista.add(item);
	}
	
	public List<Product> getALL(){
		return Lista;
	}

}
