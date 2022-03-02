package com.api.controller;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.service.Amex;
import com.api.service.ITarjeta;
import com.api.service.InfoRequest;
import com.api.service.InfoResponse;
import com.api.service.Nara;
import com.api.service.Visa;


@RestController
@RequestMapping("/")
public class SystemController {
	
	

	
	@PostMapping("/getTasa")
	public ResponseEntity<?> getProductByJson(@RequestBody InfoRequest request){
		
		 ArrayList<ITarjeta> cardList = new ArrayList<ITarjeta>();
		
		 cardList.add(new Visa());
		 cardList.add(new Nara());
		 cardList.add(new Amex());
		
		 try {
			 double importe = cardList.stream().filter(p->p.marca().equals(request.marca)).collect(Collectors.toList()).get(0).importeAPagar(request.importe);
			 
			 return ResponseEntity.ok(new InfoResponse(importe));
		 }catch(Exception e ) {
			 return ResponseEntity.status(HttpStatus.CREATED).body("marca not found");
			 
		 }
		 
		
		
	}
	

}
