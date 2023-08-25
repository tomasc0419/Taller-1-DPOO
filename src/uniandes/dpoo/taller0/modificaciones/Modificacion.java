package uniandes.dpoo.taller0.modificaciones;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;

public class Modificacion {
public void main() {
	try {
		System.out.println("Hola, mundo!"); 
		CalculadoraEstadisticas calc =LoaderOlimpicos.cargarArchivo("atletas.csv"); 
		System.out.println(calc.paisConMasMedallistas());
	} catch(FileNotFoundException e) { 
		e.printStackTrace(); 
	
	} catch(IOException e) {
		e.printStackTrace();
	}
 }
}
