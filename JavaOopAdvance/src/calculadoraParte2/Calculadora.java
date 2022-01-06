package calculadoraParte2;

import java.io.Serializable;

public class Calculadora implements Serializable{
	//VARIABLES
	
	
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	
	private int result;
	
	private String suma = "+";
	private String resta = "-";
	private String multi = "*";
	private String divi = "/";
	
	
	
	//CONSTRUCTOR
	public Calculadora() {
	}
	
	//GETTERS Y SETTERS
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}
	
	public int getNum5() {
		return num5;
	}

	public void setNum5(int num5) {
		this.num5 = num5;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getSuma() {
		return suma;
	}

	public void setSuma(String suma) {
		this.suma = suma;
	}

	public String getResta() {
		return resta;
	}

	public void setResta(String resta) {
		this.resta = resta;
	}

	public String getMulti() {
		return multi;
	}

	public void setMulti(String multi) {
		this.multi = multi;
	}

	public String getDivi() {
		return divi;
	}

	public void setDivi(String divi) {
		this.divi = divi;
	}
	
	
	
	

}
