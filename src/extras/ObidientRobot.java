package extras;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObidientRobot {
	static Robot no = new Robot();

	public static void main(String[] args) {
		no.setSpeed(10);
		no.penDown();
		String yes = JOptionPane.showInputDialog("Shape?");
		String hi = JOptionPane.showInputDialog("Color?");
		if (hi.equals("red")) {
			no.setPenColor(Color.red);
		} else if (hi.equals("blue")) {
			no.setPenColor(Color.blue);
		} else if (hi.equals("green")) {
			no.setPenColor(Color.green);
		} else if (hi.equals("yellow")) {
			no.setPenColor(Color.yellow);
		}
		if (yes.equals("circle")) {
			drawCircle();
		} else if (yes.equals("square")) {
			drawSquare();
		} else if (yes.equals("triangle")) {
			drawTriangle();
		}

	}

	public static void drawSquare() {

		for (int i = 0; i < 4; i++) {
			no.move(100);
			no.turn(360 / 4);
		}

	}

	public static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			no.move(100);
			no.turn(360 / 3);
		}
	}

	public static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			no.move(1);
			no.turn(360 / 360);
		}
	}
}