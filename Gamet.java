
import java.util.Scanner;

public class Gamet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean go = true;

		int gissningar = 0; //Deklarerar 0 f�r att antalet gissningar l�ggs p� f�r varje gissning och startar p� 0.

		System.out.println("Gissa talet fr�n 0-100!");

		int gissningen = input.nextInt();

		int random = (int) (Math.random() * 100); //genererar ett random tal mellan 0-100

		while (go = true) {

			if (0 <= gissningen && gissningen <= 100) {

				if (gissningen > random) {

					System.out.println("Du gissade f�r h�gt!");
					gissningar++;
				}

				if (random > gissningen) {
					System.out.println("Du gissade f�r l�gt!");
					gissningar++;
				}
				if (gissningen == random) {
					gissningar++;
					System.out.println("Du gissade r�tt din turunge");
					System.out.println("Grattis, g� och k�p en lott..");
					System.out.println("Du gissade r�tt p� " + gissningar + " f�rs�k!");
					go = false;

				}
			}

			else {
				System.out.println("Obs, du m�ste gissa mellan 0-100, inte �ver eller under..");

			}
			gissningen = input.nextInt();
		}

	}

}
