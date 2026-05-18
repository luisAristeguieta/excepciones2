package com.krakeDev.Taller.Exepciones2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeerContacto {

	private static final Logger log = LogManager.getLogger(LeerContacto.class);

	public static void main(String[] args) {

		FileReader lectorArchivo = null;
		BufferedReader lector = null; // Si se cierra Buffered ya cerraia FileReader

		try {
			lectorArchivo = new FileReader("contactos.txt");
			lector = new BufferedReader(lectorArchivo);

			for (int i = 0; i < 3; i++) {
				log.info(lector.readLine());
			}
			log.info("Archivo leido exitosamente");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			log.error("Error en encontrar el archivo " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			log.error("Error al leer el archivo " + e.getMessage());
		} finally {
			try {
				if (lector != null) {
					lector.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				log.error("Error al cerrar el archivo  " + e.getMessage());
			}
		}
	}

}
