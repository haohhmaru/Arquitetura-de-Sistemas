//Alessandro Lima Da Silva R.A 201522705 CCP3AN-MCA
package br.usjt.arqsw.dao;


import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import br.usjt.arqsw.entity.Fila;

@Repository
public class FilaDAO {
EntityManager manager; 
	
	public FilaDAO(EntityManager manager){ 
		this.manager = manager; 
	} 
	public void criar(Fila fila){ 
		manager.persist(fila); 
	} 
	public void atualizar(Fila fila){ 
		manager.merge(fila); 
	} 
	public void remover(Fila fila){ 
		manager.remove(fila); 
	}
	public Fila selecionar(int id){ 
		return manager.find(Fila.class, id); 
	} 
	
@SuppressWarnings("unchecked") 
	public List<Fila> selecionarTodas(){ 
		return manager.createQuery("select l from Fila l").getResultList(); 
	}
}
