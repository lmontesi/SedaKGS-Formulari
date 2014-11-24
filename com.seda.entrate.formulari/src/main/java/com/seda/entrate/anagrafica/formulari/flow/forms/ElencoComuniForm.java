/**
 * 
 */
package com.seda.entrate.anagrafica.formulari.flow.forms;

import java.io.Serializable;

import javax.validation.constraints.Pattern;


/**
 * Rappresenta la form della pagina ElenoComuni
 * @author lmontesi
 *
 */
public class ElencoComuniForm implements Serializable{


	private static final long serialVersionUID = 7751377734027415782L;
	
	@Pattern(regexp="^[a-zA-Z0-9_]{4}$",message="{formElencoComuni.codiceBelfiore.regex} ") 
	private String codiceBelfiore;
	private String descrizioneComune;
	private String statoComune;
	private String tipologia;
	
	public ElencoComuniForm(String codiceBelfiore, String descrizioneComune,
			String statoComune, String tipologia) {
		super();
		this.codiceBelfiore = codiceBelfiore;
		this.descrizioneComune = descrizioneComune;
		this.statoComune = statoComune;
		this.tipologia = tipologia;
	}
	
	public ElencoComuniForm() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public String getCodiceBelfiore() {
		return codiceBelfiore;
	}

	public void setCodiceBelfiore(String codiceBelfiore) {
		this.codiceBelfiore = codiceBelfiore;
	}

	public String getDescrizioneComune() {
		return descrizioneComune;
	}
	
	public void setDescrizioneComune(String descrizioneComune) {
		this.descrizioneComune = descrizioneComune;
	}
	
	public String getStatoComune() {
		return statoComune;
	}
	
	public void setStatoComune(String statoComune) {
		this.statoComune = statoComune;
	}
	
	public String getTipologia() {
		return tipologia;
	}
	
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	@Override
	public String toString() {
		return "FormElencoComuni [codiceBelfiore=" + codiceBelfiore
				+ ", descrizioneComune=" + descrizioneComune + ", statoComune="
				+ statoComune + ", tipologia=" + tipologia + "]";
	}
	
	
	

	
}
