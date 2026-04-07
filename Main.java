import java.util.Scanner;

class Main
{
		
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in); // tworzy obiekt scanner klasy Scanner, ze zmienną System.in

	System.out.println("Podaj swoje nazwisko: ");		
	String nazwisko = scanner.nextLine(); // tworzy obiekt nazwisko o klasy String, do której zapisuje wartość wyplutą przez metodę nextLine obiektu scanner ( który jest klasą Scanner) 
	System.out.println("Podaj swoje imie: ");
	String imie = scanner.nextLine(); 
	System.out.println("Podaj swój wiek: ");
	int wiek = scanner.nextInt();	 // tworzy zmienną wiek o typie int, do której zapisuje wartość wyplutą przez metodę nextInt obiektu scanner ( który jest klasą Scanner)
	System.out.printf("\nWitaj %s, %s, wiek: %d \n", imie, nazwisko,wiek);	
	
	
	if (wiek >= 18)	System.out.println("Jesteś pełnoletni");
	else System.out.println("Jesteś niepełnoletni");
 
	
	}
}
