package calculadoraParte2Test;

public class calculadoraTest {

	public static void main(String[] args) {
		
		calculadoraOperaciones operation = new calculadoraOperaciones();
		calculadora operacion = operation.performOperationSuma(80, 20, 10, 8, 2);
		System.out.println("El resultado total es: " + operacion.getNum1() + "+" + operacion.getNum2() + "-" + (operacion.getNum3()+ "*" + operacion.getNum4() + "/" +operacion.getNum5()) + " = " + operacion.getResult());
	
	}

}
