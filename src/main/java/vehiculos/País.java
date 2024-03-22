package vehiculos;

import java.util.ArrayList;

public class País {
	private String nombre;
	private static ArrayList<País> listado = new ArrayList<País>();
	
	public País() {
		listado.add(this);
	}
	
	public static int contarOcurrencias(País pais, ArrayList<País> listado) {
		int contador = 0;
		
		for(int i = 0; i < listado.size(); i++) {
			if(listado.get(i) == pais) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static String paisMasVendedor() {
		
		País pais_mas_vendedor = listado.get(0);
		int numero_ocurrencias = contarOcurrencias(pais_mas_vendedor, listado);
		
		for(int i = 0; i < listado.size(); i++) {
			if(contarOcurrencias(listado.get(i), listado) > numero_ocurrencias) {
				pais_mas_vendedor = listado.get(i);
				numero_ocurrencias = contarOcurrencias(listado.get(i), listado);
			}
		}
		
		return pais_mas_vendedor.getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static ArrayList<País> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<País> listado) {
		País.listado = listado;
	}
}
