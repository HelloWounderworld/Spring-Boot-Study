package jp.com.mathcoder.exerciciossboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.com.mathcoder.exerciciossboot.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-10");
	}
}
