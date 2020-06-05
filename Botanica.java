package classes;

public class Botanica {
   

	public static void main(String[] args) {
	
	System.out.println("______ _             _   _       _             _____ _                \r\n" + 
			"| ___ \\ |           | | (_)     | |           |_   _(_)               \r\n" + 
			"| |_/ / | __ _ _ __ | |_ _ _ __ | |__   __ _    | |  _ _ __ ___   ___ \r\n" + 
			"|  __/| |/ _` | '_ \\| __| | '_ \\| '_ \\ / _` |   | | | | '_ ` _ \\ / _ \\\r\n" + 
			"| |   | | (_| | | | | |_| | | | | | | | (_| |   | | | | | | | | |  __/\r\n" + 
			"\\_|   |_|\\__,_|_| |_|\\__|_|_| |_|_| |_|\\__,_|   \\_/ |_|_| |_| |_|\\___|\r\n" + 
			"                                                                     ");
		
		
	Briofitas p1 = new Briofitas("Musgo", 2 , "Bryopsida", "Bryophyta sensu stricto");
 System.out.print(p1.toString());
	
 p1.tomarSol();
	p1.soltarEsporos();
	
	}
}
