package loja_virtual_TysBy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import loja_virtual_TysBy.model.Acesso;
import loja_virtual_TysBy.service.AcessoService;

@Controller
public class AcessoController {
     
	
	@Autowired
	private AcessoService acessoService;
	
	
	
	@PostMapping("/salvarAcesso")
	public Acesso salvarAcesso(Acesso acesso) {
		
		return acessoService.save(acesso);
	
	
	}



	
}
