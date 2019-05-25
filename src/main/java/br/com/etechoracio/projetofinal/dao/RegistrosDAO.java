package br.com.etechoracio.projetofinal.dao;

import br.com.etechoracio.common.dao.BaseDAO;
import br.com.etechoracio.projetofinal.model.Registros;

public interface RegistrosDAO extends BaseDAO<Registros> {

	public Registros findByIdOrNome(int id, String nome);

}
