package com.bancolombiafinal.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombiafinal.app.entities.Product;
import com.bancolombiafinal.app.services.IService;

@RestController
@RequestMapping("/item")
public class MicroController {
	
	@Autowired
	private IService servicio;
	
	@PostMapping
	public ResponseEntity<String> insert(@RequestBody Product item){
		
		if(servicio.insert(item))
			return new ResponseEntity<String>("OK", HttpStatus.CREATED);
		
		return new ResponseEntity<String>("NOT OK", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> get(){
		
		return new ResponseEntity<List<Product>>(servicio.getALL(), HttpStatus.OK);
	}
}
