package Telefono;

public class PhoneTester {

	public static void main(String[] args) {
		
		System.out.println("Phone Iphone");
		IPhone iphone = new IPhone("N48493S",90,"SI","musica.mp3");
		iphone.displayInfo();
		iphone.ring();
		iphone.unlock();
		//
		System.out.println("--------------------------------------");
		System.out.println("Phone galaxy");
		
		Galaxy galaxy = new Galaxy("S20 2021", 10, "SI", "samsung.mp3");
		galaxy.ring();
		galaxy.unlock();
		galaxy.displayInfo();
		

	}

}
