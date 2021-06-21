package paquete;

import java.awt.Color;



public aspect FondoAspect {
	
	public static EventManager manager;

	
	pointcut create(): call(void Ventana()) && args();
    before(): create(){
		System.out.println("asasasas");
    }
		
	
	pointcut success(Color c): call(void cambiarColor(**)) && args(c);
    after(Color c): success(c){
		Ventana.manager.notify("cambioColor",c);
    }
		

}
