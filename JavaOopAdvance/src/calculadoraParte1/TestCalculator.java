package calculadoraParte1;

public class TestCalculator {

	public static void main(String[] args) {
		
		OperationsCalculator operationsCalculator = new OperationsCalculator();
		Calculator suma = operationsCalculator.performOperationSuma(10, 5);
		System.out.println("El resultado de la suma es: " + suma.getResult());
		
		
		Calculator resta = operationsCalculator.performOperationResta(4, 2);
		System.out.println("El resultado de la resta es: " + resta.getResult());
	}

}
