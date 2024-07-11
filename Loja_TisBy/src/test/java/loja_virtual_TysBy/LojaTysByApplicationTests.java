package loja_virtual_TysBy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import loja_virtual_TysBy.controller.AcessoController;
import loja_virtual_TysBy.model.Acesso;
import loja_virtual_TysBy.repository.AcessoRepository;
import loja_virtual_TysBy.service.AcessoService;

@SpringBootTest(classes = LojaTysByApplication.class )
public class LojaTysByApplicationTests {
	
	
	
	@Autowired
	private AcessoService acessoService;

	//@Autowired
	//private AcessoRepository acessoRepository;
	
	@Autowired
	private AcessoController acessoController;
	
	
	
	@Test
	public void testCadastraAcesso() {
	
	 
	    Acesso acesso = new Acesso();
	    acesso.setDescricao("ROLE_ADMIN");
	    
	    acessoController.salvarAcesso(acesso);
	
	
	}
	
	

}
