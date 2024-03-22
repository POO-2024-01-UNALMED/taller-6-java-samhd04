package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> listado = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}
	
	public static int contarOcurrencias(Pais pais, ArrayList<Pais> listado) {
		int contador = 0;
		
		for(int i = 0; i < listado.size(); i++) {
			if(listado.get(i) == pais) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static Pais paisMasVendedor() {
		
		Pais pais_mas_vendedor = listado.get(0);
		int numero_ocurrencias = contarOcurrencias(pais_mas_vendedor, listado);
		
		for(int i = 0; i < listado.size(); i++) {
			if(contarOcurrencias(listado.get(i), listado) > numero_ocurrencias) {
				pais_mas_vendedor = listado.get(i);
				numero_ocurrencias = contarOcurrencias(listado.get(i), listado);
			}
		}
		
		return pais_mas_vendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static ArrayList<Pais> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Pais> listado) {
		Pais.listado = listado;
	}
}
