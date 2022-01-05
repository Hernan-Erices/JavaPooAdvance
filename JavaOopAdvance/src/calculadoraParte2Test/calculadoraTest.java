package calculadoraParte2Test;

public class calculadoraTest {

	public static void main(String[] args) {
		
		calculadoraOperaciones operation = new calculadoraOperaciones();
		calculadora operacion = operation.performOperationSuma(20, 2, 40, 2, 2);
		System.out.println("El resultado de la suma es: " + operacion.getNum5() + "*" + operacion.getNum4() + "/" + operacion.getNum3()+ "+" + operacion.getNum2() + "-" +operacion.getNum1() + " = " + operacion.getResult());
	}

}
