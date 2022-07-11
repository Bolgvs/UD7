import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Act7_3App {

	public static void main (String [] args) {

		crearHashtable();
			
		queHacer();	
		
	}
	
	// Crear las Hashtable
	
	public static void crearHashtable() {
		
		Hashtable<String, Double> aPrecio = new Hashtable<>();
		
		Hashtable<String, Integer> aCantidad = new Hashtable<>();
		
		// Se ejecuta al principo del programa para cargarlos en los hashtables
		
		baseDatos(aPrecio, aCantidad);
		
	}
	
	// Qué quiere hacer el usuario:
	
	public static void queHacer() {
		
		int opciones = 0;
		
		do {
			
			String texto_opciones = JOptionPane.showInputDialog("Que quieres hacer?\n1 --> Añadir productos\n2 --> Ver info de 1 solo producto"
					
					+ "\n3 --> Ver info entera\n4 --> Salir");
			
			opciones = Integer.parseInt(texto_opciones);
			
			Hashtable<String, Double> aPrecio;
			
			Hashtable<String, Integer> aCantidad;
			
			switch (opciones) {
			
				case 1:
					
					añadirArticulo(aPrecio, aCantidad);
					
					break;
					
				case 2:
					
					mostrarProducto(aPrecio, aCantidad);
					
					break;
					
				case 3:
					
					mostrarTodo(aPrecio, aCantidad);
					
					break;
					
				case 4:
					
					// No hace nada pero es para que no entre en el defual
					
					break;
					
				default:
					
					JOptionPane.showMessageDialog(null, "Numero incorrecto");
					
			}
			
		} while (opciones != 4);
		
	}

	// Para crear la base de datos (solo se ejecuta al inicio)
	
	public static void baseDatos (Hashtable<String,Double> aPrecio, Hashtable<String, Integer> aCantidad) {
		
		// Para el precio de los productos
		
		aPrecio.put("Cerezas", 3.5);
		
		aPrecio.put("Naranjas", 7.15);
		
		aPrecio.put("Champú", 5.50);
		
		aPrecio.put("Pasta de dientes", 3.91);
		
		aPrecio.put("Pan de pipas", 2.15);
		
		aPrecio.put("Chocolate negro", 1.39);
		
		aPrecio.put("Smints", 1.45);
		
		aPrecio.put("Pan", 0.85);
		
		aPrecio.put("Nachos", 4.29);
		
		aPrecio.put("Pintura", 9.77);
		
		// Para la cantidad de los productos
		
		aCantidad.put("Cerezas", 10);
		
		aCantidad.put("Naranjas", 35);
		
		aCantidad.put("Champú", 25);
		
		aCantidad.put("Pasta de dientes", 35);
		
		aCantidad.put("Pan de pipas", 49);
		
		aCantidad.put("Chocolate negro", 28);
		
		aCantidad.put("Smints", 86);
		
		aCantidad.put("Pan", 95);
		
		aCantidad.put("Nachos", 19);
		
		aCantidad.put("Pintura", 85);
		
	}
	
	// Para añadir un producto al diccionario:
	
	public static void añadirArticulo (Hashtable<String,Double> aPrecio, Hashtable<String, Integer> aCantidad) {
		
		String texto_nombre = JOptionPane.showInputDialog("¿Cómo se llama el producto").toLowerCase();
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la cantidad del producto?"));
		
		double precio = Double.parseDouble(JOptionPane.showInputDialog("¿Qué precio tiene el producto?"));
		
		aPrecio.put(texto_nombre, precio);
		
		aCantidad.put(texto_nombre, cantidad);
		
	}
	
	// Para consultar solo un producto
	
	public static void mostrarProducto (Hashtable<String,Double> aPrecio, Hashtable<String, Integer> aCantidad) {
		
		String texto_nombre = JOptionPane.showInputDialog("Di el nombre del producto");
		
		JOptionPane.showMessageDialog(null, "El precio de " + texto_nombre + " es de: " + aPrecio.get(texto_nombre));
		
		JOptionPane.showMessageDialog(null, "La cantidad de " + texto_nombre + "es de: " + aPrecio.get(texto_nombre));
		
	}
	
	// Para mostrar todos los productos
	
	public static void mostrarTodo (Hashtable<String,Double> aPrecio, Hashtable<String, Integer> aCantidad) {
		
		JOptionPane.showMessageDialog(null, "Producto con precio " + aPrecio.toString());
		
		JOptionPane.showMessageDialog(null, "Producto con cantidad " + aCantidad.toString());
		
	}
}