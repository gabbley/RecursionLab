import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Grid {

	private static int[][] cookieGrid;
	private static int cookieNum;
	
	private static int row, col;

	private Stack<State> trackPath;

	private static String fileName = "cookies.txt";

	public Grid(String fileName, int r, int c) {

		trackPath = new Stack<State>(); //how do i use lol
		
		this.row = r;
		this.col = c;

		try {
			inputFile = new Scanner(new FileReader(fileName));
		} catch (IOException ex) {
			System.out.println("*** Cannot open " + fileName + " ***");
			System.exit(1);
		}

		cookieNum = 0;
		cookieGrid = new int[11][11];

		for (int i = 0; i < cookieGrid.length; i++) {
			for (int j = 0; j < cookieGrid[0].length; j++) {
				if (inputFile.hasNextInt())
					cookieGrid[i][j] = inputFile.nextInt();
			}
		}

	}

	Scanner inputFile = null;

	public static int optimalPath(int row, int col) {
		if (atOrigin()) {
			return cookieNum;
		}
		if (canGoLeft() && canGoUp()) {
			goLeft(row, col); // go left by default
			return cookieNum + optimalPath(row, col);
		}
		if (canGoLeft()) {
			return cookieNum + optimalPath(row, col);
		}
		if (canGoUp()) {
			return cookieNum + optimalPath(row, col);
		} else {
			return cookieNum;
		}

	}

	public static boolean atOrigin() {
		return (row == 0 && col == 0);
	}

	public static boolean canGoLeft() {
		boolean res = false;
		if (checkBarrel(row--, col))
			res = true;

		return res;
	}

	public static boolean canGoUp() {
		boolean res = false;
		if (checkBarrel(row, col--))
			 res = true;
		return res;
	}

	public static void goLeft(int row, int col) {
		// move first
		row--;
		updateCookies(row, col);
	}

	public void goUp(int row, int col) {
		// move first
		col--;
		updateCookies(row, col);
	}

	public static boolean checkBarrel(int row, int col) {
		return (row != -1 && col != -1);
	}

	public static void updateCookies(int row, int col) {
		cookieNum += cookieGrid[row][col];
	}

	public static Scanner readFile(String filename) { // file to Scanner object
		File f = new File(filename);
		Scanner input = null;
		try {
			input = new Scanner(f);
		} catch (FileNotFoundException e) {
			return null;
		}
		return input;
	}

	public static void main(String[] args) {
		Grid testGrid = new Grid(fileName, 10, 10);
		System.out.println(testGrid.toString());
		optimalPath(10, 10);
	}

	@Override
	public String toString() {
		String s = "";

		for (int i = 0; i < cookieGrid.length; i++) {
			for (int j = 0; j < cookieGrid[0].length; j++) {
				s += cookieGrid[i][j] + "  ";
			}
			s += "\n";
		}
		return s + "number of cookies: " + cookieNum;
	}

}
