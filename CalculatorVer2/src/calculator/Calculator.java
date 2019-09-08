package calculator;

import java.util.*;
import java.io.*;

public class Calculator {

	/* Converts infix expression to postfix expression */
	public static ArrayList<String> convertInfix(String[] infixExp) {

		Stack<String> operators = new Stack<>();
		ArrayList<String> postfix = new ArrayList<String>();

		for (int i = 0; i < infixExp.length; i++) {
			// if operand, append to postfix expression
			if (isNumeric(infixExp[i])) {
				postfix.add(infixExp[i]);
			} else if (infixExp[i].equals("(")) {
				operators.push(infixExp[i]);
			} else if (infixExp[i].equals(")")) {
				while (!operators.empty() && !operators.peek().equals("(")) {
					postfix.add(operators.pop());
				}
				operators.pop();
			} else {
				while (!operators.empty() && !operators.peek().equals("(")
						&& !hasHigherPrecedence(infixExp[i], operators.peek())) {
					postfix.add(operators.pop());
				}
				operators.push(infixExp[i]);
			}
		}
		while (!operators.empty()) {
			postfix.add(operators.pop());
		}
		return postfix;
	}

	/* Evaluates a postfix expression */
	public static double calculatePostExp(ArrayList<String> postExp) {
		Stack<Double> operands = new Stack<>();
		for (String element : postExp) {
			double result; // the result for each single expression
			// if the element is a number, push into stack
			if (isNumeric(element)) {
				operands.push(Double.parseDouble(element));
			}
			// ADD IF ELEMENTS >= 2, THROW EXCEPTION
			// if the element is an operand, pop the top 2 numbers and evaluate the
			// expression
			else {
				double rightNumber = (double) operands.pop();
				double leftNumber = (double) operands.pop();
				result = calculate(leftNumber, rightNumber, element);
				operands.push(result);
			}
		}
		return operands.pop();
	}

	/*
	 * Checks whether an expression is balanced. The number of left parentheses must
	 * equal to the number of right parentheses
	 */
	public static boolean isBalanced(String equation) {
		// variables to count left and right parentheses
		int numOfLeftPar = 0;
		int numOfRightPar = 0;
		/* going through the expression */
		for (int i = 0; i < equation.length(); i++) {
			if (equation.charAt(i) == '(') {
				numOfLeftPar++;
			} else if (equation.charAt(i) == ')') {
				numOfRightPar++;
			}
		}
		return numOfLeftPar == numOfRightPar;
	}

	/* Given two Integers and the operator, calculate the results */
	public static double calculate(double num1, double num2, String operator) {
		double result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}
		return result;
	}

	// Helper functions

	/* Compares the precedence of two operators */

	public static boolean hasHigherPrecedence(String op1, String op2) {
		if ((op1.equals("+") || op1.equals("-")) && (op2.equals("*") || op2.equals("/"))) {
			return false;
		} else if ((op1.equals("*") || op1.equals("*")) && (op2.equals("+") || op2.equals("-"))) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Breaks down mathematical expression
	 * 
	 * Keeps decimal and double digits. GUI input must take in white space between
	 * every operator and operand
	 */

	public static String[] splitExp(String eq) {
		String[] expression = eq.split("\\s+");
		return expression;
	}

	/* Checks if a string is numeric */

	public static boolean isNumeric(String num) {
		try {
			double d = Double.parseDouble(num);
		} catch (NumberFormatException | NullPointerException nfe) {
			return false;
		}
		return true;
	}
	
	// NOTE: when inputting, use # to indicate a negative sign

}
