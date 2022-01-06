package bankAccount;

public class BankAccount {
	
	//VARIABLES
	int numCuenta;
	double saldoCC;
	double saldoCA;
	
	//VARIABLES ESTATICAS
	public static int cuentasCreadas = 0;
	private static int DinAlmacenado;
	
	// METODO NUMERO ALEATORIO
	private static void numeroCuenta(int numCuenta2) {
		int start=1000000000;
		int Final = 999999999;
	    int numCuenta1 = (int) (start + Math.random() * Final);
	    System.out.println("El numero de cuenta es: " + numCuenta1);
	}
	
	//CONSTRUCTOR
	public BankAccount(double saldoCC, double saldoCA) {
		this.saldoCC = saldoCC;
		this.saldoCA = saldoCA;	
		
		numeroCuenta(numCuenta);
		
		
		//NUMERO DE CUENTAS CREEADAS
		cuentasCreadas++;
	}
	
	public void MostrarUsuario() {
		System.out.println("Saldo en la cuenta corriente: " + getSaldoCC());
		System.out.println("Saldo en la cuenta de ahorros: " + getSaldoCA());
	}
	
	
	//METODO DEPOSITAR
	public static void depositarDinero() {
		
	}
	
	//METODO RETIRAR DINERO
	public static void retirarDinero() {
		
	}
	
	
	
	
	
	//GETTERS
	public double getSaldoCC() {
		return saldoCC;
	}
	
	public double getSaldoCA() {
		return saldoCA;
	}
	

	//METODO RETORNAR NUMERO DE CUENTAS CREADAS
	public static int cuentasCreadas() {
		return cuentasCreadas;
	}
	
	
	
	

}
