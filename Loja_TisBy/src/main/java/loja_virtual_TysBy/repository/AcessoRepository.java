package loja_virtual_TysBy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import loja_virtual_TysBy.model.Acesso;



@Repository
@Transactional
public interface AcessoRepository extends  JpaRepository<Acesso, Long>{

}
