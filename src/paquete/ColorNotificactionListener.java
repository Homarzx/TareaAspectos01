package paquete;

import java.awt.Color;

public class ColorNotificactionListener implements EventListener {



	public ColorNotificactionListener() {
		// TODO Auto-generated constructor stub
	}

	public void update(String eventType, Color color) {
        System.out.println("El fondo cambio a el color:" + identificadorColor(color));
    }
	
	private String identificadorColor(Color c) {
		if(c.toString().equals(Color.RED.toString())) return "ROJO";
		else if(c.toString().equals(Color.BLUE.toString())) return"AZUL";
		else if(c.toString().equals(Color.cyan.toString())) return"CYAN";
		else return null;
	}
}
