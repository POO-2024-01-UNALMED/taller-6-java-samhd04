package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo{
	private int ejes;
	private static ArrayList<Camion> listado = new ArrayList<Camion>();
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		setEjes(ejes);
		listado.add(this);
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static ArrayList<Camion> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Camion> listado) {
		Camion.listado = listado;
	}

}
