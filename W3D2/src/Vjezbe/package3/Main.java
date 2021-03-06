package package3;

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
		// **** Draw here ****
		
		g.setColor(Color.ORANGE);
		g.drawOval(100, 100, 400, 100);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("BitCamp <3", 250, 150);
		
		g.setColor(Color.BLUE);
		g.drawLine(100, 200, 500, 200);
		
		// *******************
		w.setImage(img);
	}
}
