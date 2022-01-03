package cuentaDeBanco;

import staticEjemplo.Person;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount usuario1 = new BankAccount();
		usuario1.getSaldoCuentaAhorro();
		usuario1.getNumeroCuenta();
		
		
		
		//NUMERO DE CUENTAS CREADAS
		System.out.println(BankAccount.cuentasCreadas());
		
		
		
	}

}
