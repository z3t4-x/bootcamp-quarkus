package com.nttdata.domain;

public class CatalogosValores {


	private Integer idValor;


	private String dsValor;

	private String cdCodigo;


	private String itMantenible;


	private Catalogos catalogo;


	public Integer getIdValor() {
		return this.idValor;
	}


	public void setIdValor(Integer idValor) {
		this.idValor = idValor;
	}


	public String getDsValor() {
		return this.dsValor;
	}


	public void setDsValor(String dsValor) {
		this.dsValor = dsValor;
	}


	public String getCdCodigo() {
		return this.cdCodigo;
	}


	public void setCdCodigo(String cdCodigo) {
		this.cdCodigo = cdCodigo;
	}


	public String getItMantenible() {
		return this.itMantenible;
	}


	public void setItMantenible(String itMantenible) {
		this.itMantenible = itMantenible;
	}


	public Catalogos getCatalogo() {
		return this.catalogo;
	}


	public void setCatalogo(Catalogos catalogo) {
		this.catalogo = catalogo;
	}


	@Override
	public String toString() {
		return "CatalogosValores [idValor=" + this.idValor + ", dsValor=" + this.dsValor + ", cdCodigo=" + this.cdCodigo
				+ ", itMantenible=" + this.itMantenible + ", catalogo=" + this.catalogo + "]";
	}





}
