package cuentaDeBanco;


public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount usuario1 = new BankAccount();
		usuario1.getSaldoCuentaAhorro();
		
		
		
		
		//NUMERO DE CUENTAS CREADAS
		System.out.println(BankAccount.cuentasCreadas());
	}

}
