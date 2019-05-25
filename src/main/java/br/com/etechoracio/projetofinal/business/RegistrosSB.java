package br.com.etechoracio.projetofinal.business;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.common.business.BaseSB;
import br.com.etechoracio.projetofinal.dao.RegistrosDAO;
import br.com.etechoracio.projetofinal.model.Registros;

@Service
public class RegistrosSB extends BaseSB {
	
	private RegistrosDAO registrosDAO;
	
	@Override
	protected void postConstructImpl() {
		registrosDAO = getDAO(RegistrosDAO.class);
		
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Registros registros) {
		registrosDAO.save(registros);
	}
	
	//throw new Exception ("Erro");

}
