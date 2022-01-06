package bankAccount;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount Pedro = new BankAccount(500000, 100000);
		Pedro.MostrarUsuario();
		
		System.out.println("----------------------------------------");
		
		BankAccount Juan = new BankAccount(500000, 100000);
		Juan.MostrarUsuario();
		
		System.out.println("----------------------------------------");
		
		BankAccount Matias = new BankAccount(500000, 100000);
		Matias.MostrarUsuario();
		
		
		//CUENTAS CREADAS
		System.out.println("----------------------------------------");
		System.out.println("El numero de cuentas creadas es de: " + BankAccount.cuentasCreadas());
		
	}

}
