package vehiculos;

import java.util.ArrayList;

public class Automóvil extends Vehículo{
	private int puestos;
	private static ArrayList<Automóvil> listado = new ArrayList<Automóvil>();
	
	public Automóvil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		setPlaca(placa);
		setNombre(nombre);
		setPrecio(precio);
		setPeso(peso);
		setFabricante(fabricante);
		setPuertas(4);
		setVelocidadMaxima(100);
		setTraccion("FWD");
		listado.add(this);
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static ArrayList<Automóvil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Automóvil> listado) {
		Automóvil.listado = listado;
	}
}
