package cuentaDeBanco;


public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount usuario1 = new BankAccount();
		usuario1.getSaldoCuentaAhorro();
		
		BankAccount usuario2 = new BankAccount();
		usuario2.getSaldoCuentaAhorro();
		
		
		
		
		//NUMERO DE CUENTAS CREADAS
		System.out.println(BankAccount.cuentasCreadas());
	}

}
