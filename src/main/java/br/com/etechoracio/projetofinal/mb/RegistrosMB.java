package br.com.etechoracio.projetofinal.mb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.common.view.BaseMB;
import br.com.etechoracio.projetofinal.business.RegistrosSB;
import br.com.etechoracio.projetofinal.model.Registros;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")
public class RegistrosMB extends BaseMB {

	@Autowired
	private RegistrosSB registrosSB;

	private Registros edit = new Registros();

	private List<Registros> listagem;
	
	public void onSave() {
		try {
			registrosSB.save(edit);
			listagem = registrosSB.findAll();
			showInsertMessage();
		}

		catch (Exception e) {
			showErrorMessage(e.getMessage());
		}
	}

	protected void postConstruct() {
		listagem = registrosSB.findAll();
	}
	
	public void onRemove(Registros exclusao) {
		registrosSB.remove(exclusao);
		listagem = registrosSB.findAll();
		showDeleteMessage();
	}
	
	public void onUpdate(Registros registros){
		edit = registros;
	} 

}
