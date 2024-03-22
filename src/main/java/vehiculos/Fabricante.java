package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private País pais;
	private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
	
	public Fabricante() {
		listado.add(this);
	}
	
	public static int contarOcurrencias(Fabricante fabricante, ArrayList<Fabricante> listado) {
		int contador = 0;
		
		for(int i = 0; i < listado.size(); i++) {
			if(listado.get(i) == fabricante) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static String fabricaMayorVentas() {
		Fabricante fabrica_mayor_ventas = listado.get(0);
		int numero_ocurrencias = contarOcurrencias(fabrica_mayor_ventas, listado);
		
		for(int i = 0; i < listado.size(); i++) {
			if(contarOcurrencias(listado.get(i), listado) > numero_ocurrencias) {
				fabrica_mayor_ventas = listado.get(i);
				numero_ocurrencias = contarOcurrencias(listado.get(i), listado);
			}
		}
		
		return fabrica_mayor_ventas.getNombre();
	}
	
	public País getPais() {
		return pais;
	}
	
	public void setPais(País pais) {
		this.pais = pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static ArrayList<Fabricante> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Fabricante> listado) {
		Fabricante.listado = listado;
	}
}
