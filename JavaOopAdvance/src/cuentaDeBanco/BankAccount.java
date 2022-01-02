package cuentaDeBanco;

public class BankAccount {

	static String  numeroDeCuenta;
	static double saldoCuentaCorriente;
	static double saldoCuentaAhorro;
	
	//NUMERO ALEATORIO
	public static int NumeroAleatorio() {
	    int NumAleatorio = (int) (1000000000 + Math.random() * 999999999);
	    return (int) NumAleatorio;
	}
	
	public BankAccount(double _saldoCuentaCorriente, double _saldoCuentaAhorro, int _NumAleatorio, String _numeroDeCuenta) {
		
		saldoCuentaCorriente = _saldoCuentaCorriente;
		saldoCuentaAhorro = _saldoCuentaAhorro;
		numeroDeCuenta = _numeroDeCuenta;
		
		
					
	}
	
	
	
	
	
	
	
}
