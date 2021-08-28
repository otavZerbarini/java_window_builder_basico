package Default;

import Vistas.VistaVentanaPrincipal;

public class Principal 
{
	public static void main(String[] args) 
	{
		try {
			VistaVentanaPrincipal window = new VistaVentanaPrincipal();
			window.crearVentana();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
