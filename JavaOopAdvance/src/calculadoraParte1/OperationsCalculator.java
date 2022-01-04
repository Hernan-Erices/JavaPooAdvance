package calculadoraParte1;

public class OperationsCalculator {
	
	Calculator calculator;
	
	protected Calculator performOperationSuma(int a, int b) {
		
		
		calculator = new Calculator();
		calculator.setOperandOne(a);
		calculator.setOperation("+");
		calculator.setOperandTwo(b);
		calculator.setResult(a+b);
		return calculator;
	}
	
	protected Calculator performOperationResta(int a, int b) {
		
		calculator = new Calculator();
		calculator.setOperandOne(a);
		calculator.setOperation("-");
		calculator.setOperandTwo(b);
		calculator.setResult(a-b);
		return calculator;
	}

}
