package Game;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OSGame {
	
	public static void main(String[] args) throws IOException {
		
		String filename = "0";
		
		Scanner fileIn = new Scanner(new File("0.txt"));
		
		String text = "";
		while(fileIn.hasNext()) {
			text += fileIn.nextLine();
		}
		
		System.out.println(text);
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i<4; i++){
			System.out.println("Choose choice 1 or choice 2");
			String input = scan.next();
			if (input.equals("1")) {
				filename +=0;
			} else if (input.equals("2")){
				filename +=1;
			}
			
			Scanner file = new Scanner(new File (filename + ".txt"));
			String textFile = "";
			while(file.hasNext()) {
				textFile += file.nextLine();
			}
			System.out.println(textFile);

			
		}
		
		
	
		
		
		

		
	
		
		
	}

}
