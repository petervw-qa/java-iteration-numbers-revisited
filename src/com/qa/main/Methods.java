package com.qa.main;

public class Methods {
	
	String one = "one";
	String two = "two";
	String three = "three";
	String four = "four";
	String five = "five";
	String six = "six";
	String seven = "seven";
	String eight = "eight";
	String nine = "nine";
	String ten = "ten";
	String eleven = "eleven";
	String twelve = "twelve";
	String thirteen = "thirteen";
	String fourteen = "fourteen";
	String fifteen = "fifteen";
	String sixteen = "sixteen";
	String seventeen = "seventeen";
	String eighteen = "eighteen";
	String nineteen = "nineteen";
	String twenty = "twenty";
	String thirty = "thirty";
	String fourty = "fourty";
	String fifty = "fifty";
	String sixty = "sixty";
	String seventy = "seventy";
	String eighty = "eighty";
	String ninety = "ninety";
	String hundred = "hundred";
			
	
	public String convertNumberToString(int num1) {
		String returnString = "";
		
		if (num1 < 20) {
			if (num1 == 1) {
				returnString = one;
			} else if (num1 == 2) {
				returnString =two;
			} else if (num1 == 3) {
				returnString = three;
			} else if (num1 == 4) {
				returnString = four;
			} else if (num1 == 5) {
				returnString = five;
			} else if (num1 == 6) {
				returnString = six;
			} else if (num1 == 7) {
				returnString = seven;
			} else if (num1 == 8) {
				returnString = eight;
			} else if (num1 == 9) {
				returnString = nine;
			} else if (num1 == 10) {
				returnString = ten;
			} else if (num1 == 11) {
				returnString = eleven;
			} else if (num1 == 12) {
				returnString = twelve;
			} else if (num1 == 13) {
				returnString = thirteen;
			} else if (num1 == 14) {
				returnString = fourteen;
			} else if (num1 == 15) {
				returnString = fifteen;
			} else if (num1 == 16) {
				returnString = sixteen;
			} else if (num1 == 17) {
				returnString = seventeen;
			} else if (num1 == 18) {
				returnString = eighteen;
			} else if (num1 == 19) {
				returnString = nineteen;
			} else if (num1 >= 20) {
				
				String resultString = Integer.toString(num1);
				if (resultString.length() == 3) {
					returnString = one + " " + hundred;
				} else {
					
					char firstNumber = resultString.charAt(0);
					char secondNumber = resultString.charAt(1);
					
					if (firstNumber == '2' ) {
						returnString += twenty + "-";
					}
					
					if (firstNumber == '3' ) {
						returnString += thirty + "-";
					}
					
					if (firstNumber == '4' ) {
						returnString += fourty + "-";
					}
					
					if (firstNumber == '5' ) {
						returnString += fifty + "-";
					}
					
					if (firstNumber == '6' ) {
						returnString += sixty + "-";
					}
					
					if (firstNumber == '7' ) {
						returnString += seventy + "-";
					}
					
					if (firstNumber == '8' ) {
						returnString += eighty + "-";
					}
					
					if (firstNumber == '9' ) {
						returnString += ninety + "-";
					}
					
					if (secondNumber == '1' ) {
						returnString += one + "-";
					}
					
					if (secondNumber == '2' ) {
						returnString += two + "-";
					}
					
					if (secondNumber == '3' ) {
						returnString += three + "-";
					}
					
					if (secondNumber == '4' ) {
						returnString += four + "-";
					}
					
					if (secondNumber == '5' ) {
						returnString += five + "-";
					}
					
					if (secondNumber == '6' ) {
						returnString += six + "-";
					}
					
					if (secondNumber == '7' ) {
						returnString += seven + "-";
					}
					
					if (secondNumber == '8' ) {
						returnString += eight + "-";
					}
					
					if (secondNumber == '9' ) {
						returnString += nine + "-";
					}
				}
			}
		}
		return returnString;
	

	}
	 
	public void forLoopPrint() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(convertNumberToString(i));
	}

}
	
}
