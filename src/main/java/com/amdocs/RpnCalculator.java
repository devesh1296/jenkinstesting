package com.amdocs;

import java.util.Stack;

public class RpnCalculator {
	Stack<Double> number= new Stack<Double>();
	private double firstOperand, secondOperand,result;
	public double solve(String expression) {
		String[] tokens= expression.split(" ");
		Operation obj;
		for(String token:tokens) {
				if(token.equals("+")) {
					firstOperand= number.pop();
					secondOperand= number.pop();
					obj= new Addition();
					result= obj.solve(firstOperand, secondOperand);
					number.push(result);
				}
				else if(token.equals("-")) {
					firstOperand= number.pop();
					secondOperand= number.pop();
					obj= new Subtraction();
					result= obj.solve(firstOperand, secondOperand);
					number.push(result);
				}
				else if(token.equals("*")) {
					firstOperand= number.pop();
					secondOperand= number.pop();
					obj= new Multiplication();
					result= obj.solve(firstOperand, secondOperand);
					number.push(result);
				}
				else if(token.equals("/")){
					firstOperand= number.pop();
					secondOperand= number.pop();
					obj= new Division();
					result= obj.solve(firstOperand, secondOperand);
					number.push(result);
				}
				else {
					number.push(Double.parseDouble(token));
				}
		}		
		return number.pop();
	}
}
