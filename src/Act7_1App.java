import java.util.ArrayList;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Act7_1App {
	
	public static void main (String [] args) {
		
		// Creamos array
		
		ArrayList<Integer> notas = new ArrayList<>();
		
		// Creamos variables
		
		int alumnos = 0, examenes = 0;
		
		// Se llama a la función
		
		pedirNota(notas, alumnos, examenes);
	
	}
	
	public static void pedirNota(ArrayList<Integer> notas, int alumnos, int examenes) {
		
		// Para calcular la nota media
		
		int bucle, bucle1, nota = 0, nota_media;
		
		// Pedimos el número de alumnos y exámenes
		
		String texto_alumnos = JOptionPane.showInputDialog("¿Cuántos alumnos hay inscritos?");
				
		alumnos = Integer.parseInt(texto_alumnos);
			
		String texto_examenes = JOptionPane.showInputDialog("¿Cuántos exámenes se han hecho durante el curso?");
				
		examenes = Integer.parseInt(texto_examenes);
		
		// Primer for para controlar los alumnos
			
		for (bucle = 0; bucle < alumnos; bucle++) {
			
			// Se setea la nota a 0 ya que cada vez que viene un alumno nuevo se tiene que reiniciar su valor
			
			nota = 0; 
			
			JOptionPane.showMessageDialog(null,"Este es el alumno número: " + (bucle+1));
			
		// Segundo for para controlar el num de examenes
			
			for (bucle1 = 0; bucle1 < examenes; bucle1++) {
			
				String texto_nota = JOptionPane.showInputDialog("La nota del examen " + (bucle1+1) + " es: ");
			
				nota += Integer.parseInt(texto_nota);
			
		}
			
		
		Hashtable <String, String> diccionario = new Hashtable<String, String>();
			
		// Calculamos la media y la incorporamos al array
		
		nota_media = nota / examenes; 
		
		notas.add(nota_media); 
		
		JOptionPane.showMessageDialog(null, notas);
		
		}
		
	}
		
		
		
		
}
	

	
	