package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		

		StdDraw.setPenColor(Color.LIGHT_GRAY);
		StdDraw.filledRectangle(0, 0, 1, .5);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(.5, .5, 0.2);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(.5, .5, 0.16);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(.5, .5, 0.115);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(.5, .5, 0.07);
		StdDraw.setPenColor(Color.DARK_GRAY);
		StdDraw.setPenRadius(0.05);
		StdDraw.line(.5, .5, 1, 1);
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.setPenRadius(0.01);
		double[]x = {0.55, 0.45, 0.45};
		double[]y = {0.43, 0.58, 0.48};
		StdDraw.filledPolygon(x, y);
	}
}