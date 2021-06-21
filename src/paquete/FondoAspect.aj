package paquete;

import java.awt.Color;



public aspect FondoAspect {
	
	public static EventManager manager;


		
	
	pointcut success(Color c): call(void cambiarColor(**)) && args(c);
    after(Color c): success(c){
		Ventana.manager.notify("cambioColor",c);
    }
		

}
