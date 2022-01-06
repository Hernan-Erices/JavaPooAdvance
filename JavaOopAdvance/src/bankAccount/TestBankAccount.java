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
		Matias.depositarDineroCC(1000);
		Matias.depositarDineroCA(5000);
		Matias.retirarDineroCC(10000);
		Matias.retirarDineroCA(55000);
		
		//CUENTAS CREADAS
		System.out.println("----------------------------------------");
		System.out.println("El numero de cuentas creadas es de: " + BankAccount.cuentasCreadas());	
	}
}
