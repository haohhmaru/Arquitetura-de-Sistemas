//Alessandro Lima Da Silva R.A 201522705 CCP3AN-MCA
package br.usjt.arqsw.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Fila;

public class FilaService {
	private FilaDAO dao;
	
	public FilaService() {
		dao = new FilaDAO();
	}
	public ArrayList<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	public Fila carregar(int id) throws IOException, SQLException{
		return dao.buscaFila(id);
	}
}
