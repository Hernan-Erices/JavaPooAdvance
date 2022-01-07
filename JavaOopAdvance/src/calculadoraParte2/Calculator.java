package calculadoraParte2;

import java.io.Serializable;
import java.util.ArrayList;

public class Calculator implements Serializable {
	
	private double operandOne;
	private String operation;
	private String operationF;
	private double operandTwo;
	private double result;
	
	ArrayList <Double> suma = new ArrayList <Double>();
	ArrayList <Double> resta = new ArrayList <Double>();
	ArrayList <Double> multiplicar = new ArrayList <Double>();
	ArrayList <Double> dividir = new ArrayList <Double>();
	
	
	
	//CONSTRUCTOR SIN PARAMETROS
	public Calculator() {
		
	}
	
	//GETTERS
	public void getResult() {
		this.result = result;
	}
	
	
	//SETTERS
	public void setOperandOne(int operandOne) {
		
		this.operandOne = operandOne;
		
	}
	
	public void setOperandTwo(int operandTwo) {
		
		this.operandTwo = operandTwo;
		
	}
	
	
	//OPERACIONES
	
	public void performOperation (String operacion) {
		
		if(operacion == "+") {
			
			this.operation = operacion;
			
		}else if(operacion == "-") {
			
			this.operation = operacion;
		}else if(operacion == "=") {
			
			this.operation = operacion;
		}else if(operacion == "/") {
			
			this.operation = operacion;
		}else if(operacion == "*") {
			
			this.operation = operacion;
		}else {
			System.out.println("Operacion invalida");
		}
		
	}
	
	
	//NUMEROS
	
	public void performOperation(double variable) {
		
		if(operandOne == 0) {
			operandOne = variable;
		}
		
		if(operandOne != 0) {
			operandTwo = variable;
		}
		//SUMA
		if(operation == "+") {
			suma.add(operandOne);
			operandOne = operandTwo;
			operationF = "+";
		}
		//RESTA
		if(operation == "-") {
			resta.add(operandOne);
			operandOne = operandTwo;
			operationF = "-";
		}
		
		//MULTIPLICACION
		if(operation == "*" && operandOne !=0 && operandTwo !=0) {
			multiplicar.add(operandOne);
			multiplicar.add(operandTwo);
			operandOne = 0;
			operandTwo = 0;
			operationF = "*";
		}
		
		//MULTIPLICACION CONDICIONAL
		if(operation == "*" && operandTwo ==0) {
			multiplicar.add(operandOne);
			operandOne = 0;
			operandTwo = 0;
			operationF = "*";
		}
		
		//DIVISION
		if(operation == "/" && operandOne != 0 && operandTwo !=0) {
			
			dividir.add(operandOne);
			dividir.add(operandTwo);
			operandOne = 0;
			operandTwo = 0;
			
		}
		//DIVISION CONDICIONAL
		if(operation == "/" && operandTwo == 0) {
		
			dividir.add(operandOne);
			operandOne = 0;
			operandTwo = 0;
			operationF = "/";	
		}
		
		// SUMAAA
		if(operation == "=" && operationF == "+") {
		
			suma.add(operandOne);
		
		}
		//RESTA
		if(operation == "=" && operationF == "-") {
			
			resta.add(operandOne);
			
		}
		//MULTIPLI
		if(operation == "=" && operationF == "*") {	}
		//DIVISION
		if(operation == "=" && operationF == "/") { }
			
		public static Results() {
		
			double sumatotal = 0;
			for(int i = 0; i<suma.size(); i++) {
				sumatotal = (double) (suma.get(i)+sumatotal);
			}
			
			double restatotal = 0;
			for(int i = 0; i<suma.size(); i++) {
				restatotal = (double) (resta.get(i)-restatotal);
			}
			
			double multiplicacion = 1;
			for(int i = 0; i<suma.size(); i++) {
				multiplicacion = (double) (multiplicar.get(i)*multiplicacion);
			}
			
			double division = 1;
			for(int i = 0; i<suma.size(); i++) {
				division = (double) (dividir.get(i)/division);
			}
			
			double resultado = sumatotal + multiplicacion - restatotal / division;
			System.out.println("Resultado: " + resultado);
			operationF = null;
		}
	}
}

