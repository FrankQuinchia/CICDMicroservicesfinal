package com.bancolombiafinal.app.services;
import java.util.List;
import com.bancolombiafinal.app.entities.Product;

public interface IService {
	
	boolean insert(Product item);
	
	List<Product> getALL();

}
