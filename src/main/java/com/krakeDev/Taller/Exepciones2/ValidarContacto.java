package com.krakeDev.Taller.Exepciones2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValidarContacto {

	private static final Logger log = LogManager.getLogger(ValidarContacto.class);

	public static void validarTelefono(String telefono) throws IllegalArgumentException {

		if (telefono.length() != 10) {
			throw new IllegalArgumentException("El telefono debe tener 10 digitos");
		}

		log.info("Telefono valido");
	}

}
