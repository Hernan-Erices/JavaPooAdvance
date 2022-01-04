package calculadoraParte1;

import java.io.Serializable;

public class Calculator implements Serializable{
	private int operandOne;
	private int operandTwo;
	private int result;
	private String operation;
	
	public Calculator() {
		
	}

	public int getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(int operandOne) {
		this.operandOne = operandOne;
	}

	public int getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(int operandTwo) {
		this.operandTwo = operandTwo;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	
}
