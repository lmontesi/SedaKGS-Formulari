/**
 * 
 */
package com.seda.entrate.anagrafica.formulari.flow.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.seda.jdbc.commons.DataPage;

import com.seda.entrate.anagrafica.formulari.domain.Comune;
import com.seda.entrate.anagrafica.formulari.flow.forms.ElencoComuniForm;
import com.seda.entrate.anagrafica.formulari.service.FormulariService;

/**
 * Con questa classe andiamo a gestire l'azione 
 * @author lmontesi
 *
 */
@Component
public class FormulariAction {

	@Autowired FormulariService formulariService;
	public DataPage<Comune> cercaComune(ElencoComuniForm elencoComuniForm,int pageNumber,int rowsPerPage) {
		
		DataPage<Comune> listaComuni =formulariService.listComuni(pageNumber, rowsPerPage);	
		
		return listaComuni;
		
	}
	
	public DataPage<Comune> init() {
		
		DataPage<Comune> listaComuni =formulariService.listComuni(1, 15);	
		
		return listaComuni;
		
	}		
	
}
