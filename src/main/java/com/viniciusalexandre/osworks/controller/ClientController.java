package com.viniciusalexandre.osworks.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.viniciusalexandre.osworks.domain.model.Client;



@RestController
public class ClientController {
	
	
	@GetMapping("/client")
	public  List<Client> listar() {
		
		var client1 =new Client();
		client1.setId(1);
		client1.setEmail("email@1");
		client1.setName("Vinicius");
		client1.setTelefone("8855663358");
		var client2 =new Client();
		client2.setId(2);
		client2.setEmail("email@2");
		client2.setName("Roberto");
		client2.setTelefone("89618599");
		
		return   Arrays.asList(client1, client2);
	}

}
