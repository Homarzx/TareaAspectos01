package paquete;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame {
	public JButton boton1,boton2,boton3;
	public FlowLayout fl;
	

	
	public GUI(){
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
		
		cambiarColor(this,boton1,boton2,boton3);
		
	}
	
	 public static void cambiarColor(JFrame p,JButton b1,JButton b2,JButton b3) {
		 b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p.getContentPane().setBackground(Color.RED);
				
			}
		});
		 
		 b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					p.getContentPane().setBackground(Color.CYAN);
					
				}
			});
		 b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					p.getContentPane().setBackground(Color.blue);
					
				}
			});

		 
		 
	 }
	
	
	
	

	
	
  
		
		
		
	
}


	
	
 
		
		
		
	




