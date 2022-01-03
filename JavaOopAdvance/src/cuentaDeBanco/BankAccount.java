package cuentaDeBanco;

public class BankAccount {

	 String  numeroDeCuenta;
	 double saldoCuentaCorriente;
	 double saldoCuentaAhorro;
	
	 private static int cuentasCreadas = 0;
	 private static int rastreoDinero;
	 
	
	
	// METODO NUMERO ALEATORIO
	public static int NumeroAleatorio() {
	    int NumAleatorio = (int) (1000000000 + Math.random() * 999999999);
	    return (int) NumAleatorio;
	}
	
	//CONSTRUCTOR
	public BankAccount(double _saldoCuentaCorriente, double _saldoCuentaAhorro, int _NumAleatorio, String _numeroDeCuenta) {
		
		BankAccount.NumeroAleatorio();
		
		saldoCuentaCorriente = _saldoCuentaCorriente;
		saldoCuentaAhorro = _saldoCuentaAhorro;
		numeroDeCuenta = _numeroDeCuenta;
		
		cuentasCreadas++;	
	}
	
	
    public static int cuentasCreadas() {

        return cuentasCreadas;

    }
	
	
	
	//GETTERS
	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}
	
	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}
	
	//METODO DEPOSITAR
	public static void depositarDinero() {
		
	}
	
	//METODO RETIRAR DINERO
	public static void retirarDinero() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}