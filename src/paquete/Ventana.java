package paquete;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {
	public JButton boton1,boton2,boton3;
	public FlowLayout fl;
	

	
	public Ventana(){
		super("Ventana");
		setBounds(200,200,200,200);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		vista();
		
	}
	public void vista() {
		fl=new FlowLayout();
		setLayout(fl);
		
		boton1=new JButton("boton1");
		boton2=new JButton("boton2");
		boton3=new JButton("boton3");
		add(boton1);
		add(boton2);
		add(boton3);
		
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cambiarColor(Color.RED);
				
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cambiarColor(Color.BLUE);
				
			}
		});
		
		boton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cambiarColor(Color.CYAN);
				
			}
		});
		
	}
	public void cambiarColor(Color c) {
		getContentPane().setBackground(c);
		
		
	}
	 
	
	
	
	

	
	
  
		
		
		
	
}


	
	
 
		
		
		
	




