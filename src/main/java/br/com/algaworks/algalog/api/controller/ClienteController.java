package br.com.algaworks.algalog.api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
	
		Cliente cl1 = new Cliente();
		//Cliente cl2 = new Cliente();
		
		cl1.setId(1l);
		cl1.setNome("vinicius");
		cl1.setEmail("viniciusdoConquita@gmail.com");
		cl1.setTelefone("154545");
		
		return Arrays.asList(cl1);
	}
}
