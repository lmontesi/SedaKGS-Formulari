/**
 * 
 */
package com.seda.entrate.anagrafica.formulari.persistence;


import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.seda.entrate.anagrafica.formulari.domain.Comune;

/**
 * Interfaccia dove andiamo a definire tutti i metodi per interagire con la tabella
 * 
 * @author lmontesi
 *
 */
public interface ComuneMapper {
	
	void insertComune(Comune comune);

	void updateComune(Comune comune);

	void deleteComune(String primaryKey);

	Comune getComune(String primaryKey);

	Comune getComune(Comune comune);
	
	int listComuniCount();
	
	List<Comune> listComuni(RowBounds rowBounds); 

}
