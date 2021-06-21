package paquete;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class ColorNotificactionListener implements EventListener {
	
	File file = new File("log.txt");
	FileWriter bw;


	public ColorNotificactionListener() {
		// TODO Auto-generated constructor stub
	}

	public void update(String eventType, Color color) {
		Calendar cal = Calendar.getInstance();
        String data = "Realiza cambio color a :" + identificadorColor(color) + " a la fecha de: "+cal.getTime()+"\n";
        System.out.print(data);
        write(data);
    }
	
	private String identificadorColor(Color c) {
		if(c.toString().equals(Color.RED.toString())) return "ROJO";
		else if(c.toString().equals(Color.BLUE.toString())) return"AZUL";
		else if(c.toString().equals(Color.cyan.toString())) return"CYAN";
		else return null;
	}
	
	private void write(String s) {
		try {
    		bw = new FileWriter(file,true);
			bw.write(s);
	    	bw.close();
    		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
