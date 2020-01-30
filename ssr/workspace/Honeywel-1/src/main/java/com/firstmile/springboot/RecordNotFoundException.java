package com.firstmile.springboot;

import lombok.Data;

@Data
public class RecordNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mesaage;

	public RecordNotFoundException(String str) {
		this.mesaage=str;
	}

}
