package com.krakeDev.Taller.Exepciones2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	private static final Logger log = LogManager.getLogger(Test.class);

	public static void main(String[] args) {

		// String numero = "123";
		String numero = "0981234567";

		try {
			ValidarContacto.validarTelefono(numero);
			GuardarContacto.main(null);
			LeerContacto.main(null);
			log.info("Numero Guardado y leido correctamente");
		} catch (IllegalArgumentException e) {
			log.error("Telefono invalido " + e.getMessage());
		}

	}
}
