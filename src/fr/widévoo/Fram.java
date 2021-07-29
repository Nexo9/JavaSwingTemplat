package fr.widévoo;


import java.awt.Graphics;
import java.awt.Image;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;

public class Fram extends JFrame implements SwingerEventListener {


	public static JFrame frame = new JFrame();
	public static JButton btn = new JButton();
	public static FramPanel Panel = new FramPanel();
	
	
	public static void main(String[] args) {

		FramPanel FramPanel = new FramPanel();
		frame.setContentPane(Panel);
		frame.setTitle("JavaSwing Templat");
		frame.setSize(987, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	

	@Override
	public void onEvent(SwingerEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
