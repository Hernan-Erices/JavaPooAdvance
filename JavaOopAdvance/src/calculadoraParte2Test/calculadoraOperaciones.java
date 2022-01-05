package calculadoraParte2Test;

public class calculadoraOperaciones {
	
	calculadora Calculadora;
	
protected calculadora performOperationSuma(int a, int b, int c, int d, int e) {
		
	Calculadora = new calculadora();
	Calculadora.setNum1(a);
	Calculadora.setNum2(b);
	Calculadora.setNum3(c);
	Calculadora.setNum4(d);
	Calculadora.setNum5(e);
	Calculadora.setResult(e*d/c+b-a);
	return Calculadora;
	}
	

}
