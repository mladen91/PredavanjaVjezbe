package ba.Vjezbe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		
		
		g.setColor(Color.BLACK);
		g.drawRect(250, 100, 100, 25);
		g.drawString("API Packages", 261, 117);
		g.drawLine(100, 140, 510, 140);
		g.drawRect(55, 170, 75, 30);
		g.drawRect(140, 170, 75, 30);
		g.drawRect(225, 170, 75, 30);
		g.drawRect(310, 170, 75, 30);
		g.drawRect(395, 170, 75, 30);
		g.drawRect(480, 170, 75, 30);
		g.drawLine(100, 140, 100, 170);
		g.drawLine(180, 140, 180, 170);
		g.drawLine(260, 140, 260, 170);
		g.drawLine(340, 140, 340, 170);
		g.drawLine(420, 140, 420, 170);
		g.drawLine(510, 140, 510, 170);
		g.drawLine(510, 140, 510, 170);
		g.drawString("lang", 65, 185);
		g.drawString("util", 150, 185);
		g.drawString("io", 235, 185);
		g.drawString("awt", 320, 185);
		g.drawString("net", 405, 185);
		g.drawString("applet", 490, 185);
		
		
		//g.setFont(new Font("Cambria", Font.BOLD, 18));
		//g.drawString("BitCamp <3", 250, 150);
		
		
		//g.drawLine(100, 200, 500, 200);
		
		// *******************
		w.setImage(img);
	}
}
