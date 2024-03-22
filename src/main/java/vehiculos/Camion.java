package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehículo{
	private int ejes;
	private static ArrayList<Camion> listado = new ArrayList<Camion>();
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante) {
		setPuertas(2);
		setVelocidadMaxima(80);
		setTraccion("4X2");
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
