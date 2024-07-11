package loja_virtual_TysBy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import loja_virtual_TysBy.model.Acesso;
import loja_virtual_TysBy.repository.AcessoRepository;

@Service
public class AcessoService {

	@Autowired
	private AcessoRepository acessoRepository;

	public Acesso save(Acesso acesso) {

		return null;
	}
	
}
