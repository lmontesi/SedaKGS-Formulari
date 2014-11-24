/**
 * 
 */
package com.seda.entrate.anagrafica.formulari.service;

import it.seda.jdbc.commons.DataPage;
import it.seda.jdbc.commons.DefaultDataPage;
import it.seda.jdbc.ibatis.RowBoundsHelper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seda.entrate.anagrafica.formulari.domain.Comune;
import com.seda.entrate.anagrafica.formulari.persistence.ComuneMapper;
import com.seda.entrate.anagrafica.utils.CustomDataPage;

/**
 * @author lmontesi
 *
 */
@Service
public class FormulariService {
	
	@Autowired private ComuneMapper comuneMapper;
	
	@Transactional(readOnly=true)
	public DataPage<Comune> listComuni(int pageNumber, int rowsPerPage) {
		
		RowBoundsHelper rbh = new RowBoundsHelper(rowsPerPage, pageNumber);
//		int totalrows=comuneMapper.listComuniCount();
		
//		List<Comune> comuniList=comuneMapper.listComuni(rbh.buildRowBounds());		
		
		List<Comune> comuniList= new ArrayList() ;
		Comune com = new Comune();
		com.setCodiceBelfiore("e338");
		com.setDescrizioneComune("Jesi");
		comuniList.add(com);
		com.setCodiceBelfiore("c615");
		com.setDescrizioneComune("Chiaravalle");
		comuniList.add(com);
		
		DataPage<Comune> comuniPage=new CustomDataPage<Comune>(comuniList);
//		rbh.decorate(comuniPage, totalrows);
		rbh.decorate(comuniPage, 15);
		
		return comuniPage;
		
	}	

}
