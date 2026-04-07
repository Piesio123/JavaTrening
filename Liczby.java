class Liczby{
	
	private static int suma(int x1, int x2){
		int suma = 0;	
		suma = x1 + x2;
	 	return suma;
	}
	
	public static void main(String[] args){
	int liczba1 = 4;
        int liczba2 = 5;	
	
	int suma = suma(4,5);
	System.out.printf("%d\n", suma);
}

}
