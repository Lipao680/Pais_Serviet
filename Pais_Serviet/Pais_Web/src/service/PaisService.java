package service;

import dao.PaisDAO;
import model.Pais;
import model.PaisTO;

public class PaisService {

	PaisDAO dao;

	public void Pais() {
		dao = new PaisDAO();
	}

	public void criar(PaisTO to) {
		dao.incluir(to);
	}

	public void atualizar(PaisTO to) {
		dao.atualizar(to);
	}

	public void excluir(PaisTO to) {
		dao.excluir(to);
	}

	public Pais carregar(int id) {
		Pais to = dao.carregar(id);
		return to;
	}
}
