package br.com.etechoracio.projetofinal.business;

import org.springframework.stereotype.Service;

import br.com.etechoracio.common.business.BaseSB;
import br.com.etechoracio.projetofinal.dao.RegistrosDAO;

@Service
public class RegistrosSB extends BaseSB {
	
	private RegistrosDAO registrosDAO;
	
	@Override
	protected void postConstructImpl() {
		registrosDAO = getDAO(RegistrosDAO.class);
		
	}
	
	//public void save(Registros registros) {
//		registrosDAO.save(registros)
	//}

}
