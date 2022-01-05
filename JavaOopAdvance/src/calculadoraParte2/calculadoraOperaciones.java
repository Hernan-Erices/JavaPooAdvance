package calculadoraParte2;

public class calculadoraOperaciones {

	Calculadora calculadora;
	
	protected int operations() {
		
		calculadora = new Calculadora();
		calculadora.setNum1(0);
		calculadora.getSuma();
		calculadora.setNum2(4);
		calculadora.getResta();
		calculadora.setNum3(6);
		calculadora.getMulti();
		calculadora.setNum4(5);
		calculadora.getDivi();
		calculadora.setNum5(4);
		calculadora.setResult(calculadora.getNum1()+calculadora.getNum2()-(calculadora.getNum3()*calculadora.getNum4()/calculadora.getNum5()));
		calculadora.getResult();
		return calculadora.getResult();
	}

	
	
}
