
import java.util.Scanner;

public class Gamet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean go = true;

		int gissningar = 0; //Deklarerar 0 för att antalet gissningar läggs på för varje gissning och startar på 0.

		System.out.println("Gissa talet från 0-100!");

		int gissningen = input.nextInt();

		int random = (int) (Math.random() * 100); //genererar ett random tal mellan 0-100

		while (go = true) {

			if (0 <= gissningen && gissningen <= 100) {

				if (gissningen > random) {

					System.out.println("Du gissade för högt!");
					gissningar++;
				}

				if (random > gissningen) {
					System.out.println("Du gissade för lågt!");
					gissningar++;
				}
				if (gissningen == random) {
					gissningar++;
					System.out.println("Du gissade rätt din turunge");
					System.out.println("Grattis, gå och köp en lott..");
					System.out.println("Du gissade rätt på " + gissningar + " försök!");
					go = false;

				}
			}

			else {
				System.out.println("Obs, du måste gissa mellan 0-100, inte över eller under..");

			}
			gissningen = input.nextInt();
		}

	}

}
