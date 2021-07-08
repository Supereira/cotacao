
package com.cotacao.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class sojaneiro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;	
	
	private Long sojaJaneiro2021;
	
	private Long milhoJaneiro2021;
	
	private Long arrozJaneiro2021;
	

	

	public Long getsojaJaneiro2021() {
		return sojaJaneiro2021;
	}

	public void setsojaJaneiro2021(Long sojaJaneiro2021) {
		this.sojaJaneiro2021 = sojaJaneiro2021;
	}

	public Long getmilhoJaneiro2021() {
		return milhoJaneiro2021;
	}

	public void setmilhoJaneiro2021(Long milhoJaneiro2021) {
		this.milhoJaneiro2021 = milhoJaneiro2021;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}