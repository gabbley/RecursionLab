import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Grid {

	private int[][] cookies;
	private int cookieNum;

	public Grid(String fileName, int row, int col) {

		Scanner inputFile = null;

		try {
			inputFile = new Scanner(new FileReader(fileName));
		} catch (IOException ex) {
			System.out.println("*** Cannot open " + fileName + " ***");
			System.exit(1);
		}

		cookieNum = 0;

		for (int i = 0; i < cookies.length; i++) {
			for (int j = 0; j < cookies[0].length; j++) {

			}

		}
	}

	public int optimalPath(int row, int col) {
		if (atOrigin(row, col)) {
			return cookieNum;
		//cookies plus optimal path
		}
		
		if ()
			
	}

	public boolean atOrigin(int row, int col) {
		return (row == 0 && col == 0);
	}

	public boolean canGoLeft() {
		return true;
	}

	public boolean canGoUp() {
		return true;
	}

	public static Scanner openFile(String filename) { // file to Scanner object
		File f = new File(filename);
		Scanner input = null;
		try {
			input = new Scanner(f);
		} catch (FileNotFoundException e) {
			return null;
		}
		return input;
	}

}
