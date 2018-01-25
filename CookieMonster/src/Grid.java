
public class Grid {
	if (compareTo(this.peek()) != -1){ //use compareTo? idk??

		//this is wrong yeah

	}

	

	for (int i = 0; i < cookies.length; i++) {

		for (int j = 0; j < cookies[0].length; j++) {

			if (cookies[i][j] != 1 && cookies[i][cookies.length + 1] !=1){

				//if two ways possible

				saveNum = cookies[i][j];

				//proceed

			}

			if (cookies[i][j] != 1 || cookies[i][cookies.length + 1] !=1){

				//if one way possible

				numCookies = cookies[i][j];

			}

			if (cookies[i][j] == cookies[cookies.length][cookies.length]){

				max = cookies[i][j];

			}

		}

	}

}



//no what

public int compareTo(int o){ //uh?

	for (int i = 0; i < cookies.length; i++) {

		for (int j = 0; j < cookies[0].length; j++) {

			return (cookies[i][j] - o); 

		}

	}

	return (cookies[0][0] - this.peek());  //idk

}





	public static void main(String[] args) {

		if (args.length < 1) {

			System.out.println("No file provided");

			System.exit(1);

		}



		Scanner in = openFile(args[0]);

		if (in == null) {

			System.exit(1);

		}

		

		CookieMonster myCookie = new CookieMonster(in);



	}



	public static Scanner openFile(String filename) { //file to Scanner object



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
