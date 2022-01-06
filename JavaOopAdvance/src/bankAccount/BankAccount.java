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
	public void depositarDineroCC(double depositar) {
		double resultadoCC = depositar + getSaldoCC();
		System.out.println("Has depositado " + depositar + " a tu cuenta corriente");
		System.out.println("Tu saldo total es de: " + resultadoCC);
	}
	
	public void depositarDineroCA(double depositar) {
		double resultadoCA = depositar + getSaldoCA();
		System.out.println("Has depositado " + depositar + " a tu cuenta de ahorros");
		System.out.println("Tu saldo total es de: " + resultadoCA);
	}
	
	
	//METODO RETIRAR DINERO
	public static void retirarDineroCC(double retirar) {
		
		
	}
	
	public static void retirarDineroCA(double retirar) {
		
		
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
