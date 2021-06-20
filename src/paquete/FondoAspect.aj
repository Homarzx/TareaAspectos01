package paquete;

import java.awt.Color;


public aspect FondoAspect {

	pointcut success(Color c): call(void cambiarColor(**)) && args(c);
    after(Color c): success(c){
		if(c.toString().equals(Color.RED.toString())) System.out.println("El color de fondo es: ROJO");
		else if(c.toString().equals(Color.BLUE.toString())) System.out.println("El color de fondo es: AZUL");
		else System.out.println("El color de fondo es: CYAN");
    }

}
