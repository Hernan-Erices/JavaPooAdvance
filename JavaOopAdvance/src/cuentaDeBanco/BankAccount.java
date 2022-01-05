package cuentaDeBanco;

import java.util.Scanner;

public class BankAccount {

	 int  numeroCuenta;
	 double saldoCuentaCorriente;
	 double saldoCuentaAhorro;
	
	 public static int cuentasCreadas = 0;
	 private static int dineroAlmacenado;
	 	
		// METODO NUMERO ALEATORIO
		private static double NumeroAleatorio(int a) {
			int start=1000000000;
			int Final = 999999999;
		    int NumAleatorio = (int) (start + Math.random() * Final);
		    return NumAleatorio;
		}
	 
		//CONSTRUCTOR
		public BankAccount() {
			this.saldoCuentaCorriente = saldoCuentaCorriente;
			this.saldoCuentaAhorro = saldoCuentaAhorro;
			this.numeroCuenta = numeroCuenta;
			
			NumeroAleatorio(numeroCuenta);
			
			//NUMERO DE CUENTAS CREEADAS
			cuentasCreadas++;	
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

	//METODO RETORNAR NUMERO DE CUENTAS CREADAS
	   public static int cuentasCreadas() {
			return cuentasCreadas;
	    }
	   

		
	
	
	
	
	
	
	
	
	
	
	
	
}
