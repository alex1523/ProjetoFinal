package br.com.etechoracio.projetofinal.business;



import java.util.List;

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
	public void save(Registros registros) throws Exception {
		Registros r = registrosDAO.findByIdOrNome(registros.getId(), registros.getNome());
		
		if (r == null) {
			registrosDAO.save(registros);
		}
		
		else {
			throw new Exception("Existe registro com mesmo código ou nome");
		}
	}
	
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Registros> findAll() {
		return registrosDAO.findAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void remove(Registros exclusao) {
		registrosDAO.delete(exclusao);
	}
	
	

}
