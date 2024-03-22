package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehículo{
	private boolean volco;
	private static ArrayList<Camioneta> listado = new ArrayList<Camioneta>();
	
	public Camioneta(String placa, String nombre, int precio, int peso, Fabricante fabricante) {
		setVelocidadMaxima(90);
		setTraccion("4X4");
		listado.add(this);
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static ArrayList<Camioneta> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Camioneta> listado) {
		Camioneta.listado = listado;
	}
}
