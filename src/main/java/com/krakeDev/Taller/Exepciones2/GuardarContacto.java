package com.krakeDev.Taller.Exepciones2;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuardarContacto {

	private static final Logger log = LogManager.getLogger(GuardarContacto.class);

	public static void main(String[] args) {

		FileWriter escritor = null;

		try {
			escritor = new FileWriter("contactos.txt", true);
			escritor.write("Nombre: Maria\n");
			escritor.write("Apellido: Gomez\n");
			escritor.write("Telefono: 0981234567\n");

			log.info("Archivo Creado Con Exito");

		} catch (IOException e) {
			e.printStackTrace();
			log.error("Error al escribir el archivo  " + e.getMessage());
		} finally {
			try {
				if (escritor != null) {
					escritor.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				log.error("Error al cerrar el archivo  " + e.getMessage());
			}
		}

	}
}
