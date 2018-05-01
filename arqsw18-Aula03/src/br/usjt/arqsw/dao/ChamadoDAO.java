//Alessandro Lima Da Silva R.A 201522705 CCP3AN-MCA
package br.usjt.arqsw.dao;


import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import br.usjt.arqsw.entity.Chamado;


@Repository
public class ChamadoDAO {
	EntityManager manager; 
	
	public ChamadoDAO(EntityManager manager){ 
		this.manager = manager; 
	} 
	public void criar(Chamado chamado){ 
		manager.persist(chamado); 
	} 
	public void atualizar(Chamado chamado){ 
		manager.merge(chamado); 
	} 
	public void remover(Chamado chamado){ 
		manager.remove(chamado); 
	}
	public Chamado selecionar(int id){ 
		return manager.find(Chamado.class, id); 
	} 
	
@SuppressWarnings("unchecked") 
	public List<Chamado> selecionarTodas(){ 
		return manager.createQuery("select l from Chamado l").getResultList(); 
	}

}
