package paquete;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {
	JButton boton1,boton2,boton3;
	 GUI(){
		super("Ventana");
		setBounds(200,200,200,200);
		setVisible(true);
		setLayout(new FlowLayout());
		boton1=new JButton("boton1");
		boton2=new JButton("boton2");
		boton3=new JButton("boton3");
		add(boton1);
		add(boton2);
		add(boton3);
		
	}
	

	public static void main(String[] args) {
		GUI ventana=new GUI();
		ventana.setSize(500, 500);
		
		
	}
	
	
  
		
		
		
	
}


	
	
 
		
		
		
	




