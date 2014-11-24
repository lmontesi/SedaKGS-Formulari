/**
 * 
 */
package com.seda.entrate.anagrafica.formulari.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe che identifica la tabella Comuni/statiEsteri
 * @author lmontesi
 *
 */
public class Comune  implements Serializable {

    private static final long serialVersionUID = -5053738520280873543L;
	
    private String codiceBelfiore;
	private String descrizioneComune;
	private String statoComune;
	private String tipologia;
	private Date dataValidita;
	private String siglaProvincia;
	private String siglaStato;
	private String codiceCatastale;
	private String tribunale;
	
	public Comune(){
		super();
	}
	
	public Comune(String codiceBelfiore, String descrizioneComune,
			String statoComune, String tipologia, Date dataValidita,
			String siglaProvincia, String siglaStato, String codiceCatastale,
			String tribunale) {
		super();
		this.codiceBelfiore = codiceBelfiore;
		this.descrizioneComune = descrizioneComune;
		this.statoComune = statoComune;
		this.tipologia = tipologia;
		this.dataValidita = dataValidita;
		this.siglaProvincia = siglaProvincia;
		this.siglaStato = siglaStato;
		this.codiceCatastale = codiceCatastale;
		this.tribunale = tribunale;
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

	public Date getDataValidita() {
		return dataValidita;
	}

	public void setDataValidita(Date dataValidita) {
		this.dataValidita = dataValidita;
	}

	public String getSiglaProvincia() {
		return siglaProvincia;
	}

	public void setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
	}

	public String getSiglaStato() {
		return siglaStato;
	}

	public void setSiglaStato(String siglaStato) {
		this.siglaStato = siglaStato;
	}

	public String getCodiceCatastale() {
		return codiceCatastale;
	}

	public void setCodiceCatastale(String codiceCatastale) {
		this.codiceCatastale = codiceCatastale;
	}

	public String getTribunale() {
		return tribunale;
	}

	public void setTribunale(String tribunale) {
		this.tribunale = tribunale;
	}

	@Override
	public String toString() {
		return "Comune [codiceBelfiore=" + codiceBelfiore
				+ ", descrizioneComune=" + descrizioneComune + ", statoComune="
				+ statoComune + ", tipologia=" + tipologia + ", dataValidita="
				+ dataValidita + ", siglaProvincia=" + siglaProvincia
				+ ", siglaStato=" + siglaStato + ", codiceCatastale="
				+ codiceCatastale + ", tribunale=" + tribunale + "]";
	}
	
}
