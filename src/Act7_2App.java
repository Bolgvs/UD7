import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Act7_2App {
	
	public static void main (String [] args) {
		
		ArrayList<Integer> lista_productos = new ArrayList<>();
		
		númeroPcs(lista_productos);
		
	}
	
	// Para añadir los productos y las cantidades:
	
	public static void númeroPcs (ArrayList<Integer> lista_productos) {
		
			int bucle, productos, IVA, cantidad = 0;
			
			double cant_IVA = 0;
			
			String texto_productos = JOptionPane.showInputDialog("¿Cuántos productos quiere comprar?");
			
			productos = Integer.parseInt(texto_productos);
			
			for (bucle = 0; bucle < productos; bucle++) {
				
				String texto_cantidad = JOptionPane.showInputDialog("Cantidad del producto " + (bucle + 1));
				
				cantidad = Integer.parseInt(texto_cantidad);
				
				lista_productos.add(Integer.parseInt(texto_cantidad));
				
			}
			
			// IVA aplicado
			
			String texto_IVA = JOptionPane.showInputDialog("¿Qué IVA se aplica? (21 o 4)");
			
			IVA = Integer.parseInt(texto_IVA);
			
			switch (texto_IVA) {
			
			case "21":
			
				JOptionPane.showMessageDialog(null, "El IVA aplicado es del: " + IVA + " %");
				
				cant_IVA = (0.21 * cantidad) + cantidad; 
				
				break;
				
			case "4":
				
				JOptionPane.showMessageDialog(null, "El IVA aplicado es del: " + IVA + " %");
				
				cant_IVA = (0.04 * cantidad) + cantidad;
				
				break;
				
			default: 
					
				JOptionPane.showMessageDialog(null, "No has escogido una opción válida");
				
			}
			
			// Precio bruto total y precio + IVA
			
			JOptionPane.showMessageDialog(null, "El precio del producto bruto es: " + cantidad);
			
			JOptionPane.showMessageDialog(null, "El precio del producto neto es: " + cant_IVA);
			
			// Artículos comprados
			
			JOptionPane.showMessageDialog(null, "El número de artículos comprados son: " + productos);
			
			// Cantidad pagada
			
			String texto_dinero = JOptionPane.showInputDialog("¿Con qué cantidad de dinero quiere pagar?");
			
			// Cambio
			
			JOptionPane.showMessageDialog(null, "La cantidad pagada es de: " + texto_dinero);
			
			int dinero = Integer.parseInt(texto_dinero);
			
			int cambio = dinero - cantidad;
			
			JOptionPane.showMessageDialog(null, "La cantidad a devolver es de: " + cambio);
			
		}
			
}

