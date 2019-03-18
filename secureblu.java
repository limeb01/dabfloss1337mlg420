package securebla;

import java.util.ArrayList;
import java.util.Scanner;

public class secureblu {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Antalet med inputs");
		
		String status=input.nextLine();
		while(true) {
			int antal=input.nextInt();
			if(antal >= 1 && antal <= 1000) {
				
				break;
			}
			else {
				System.out.println("error");
			}
			
			for (int i = 1; i <= antal; i++) {
				
				if(status.startsWith("entry")) {
					
					
				}
				else {
					System.out.println("error");
					antal++;
					
				}
				
			}
			
		}
		
		
		
	}

}
