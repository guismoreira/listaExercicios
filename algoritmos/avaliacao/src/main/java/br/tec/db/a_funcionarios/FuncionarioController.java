package br.tec.db.a_funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	
	//@Autowired
	//private FuncionarioService funcionarioService;
	//
	@GetMapping("/")
	public String obterFuncionario(Long id) {
		return "";
	}
	
	@PostMapping("/")
	public String criarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO) {
		return "";
	}
}
