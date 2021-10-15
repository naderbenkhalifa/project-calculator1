import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		char operator;
	    int number1, number2;
	    double result;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);
	    System.out.println("Enter first number");
	    number1 = input.nextInt();

	    System.out.println("Enter second number");
	    number2 = input.nextInt();
	    switch (operator) {
	    case '+':
	    	
	        
	        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2) );
	        break;
	    case '-':
	        
	        System.out.println(number1 + " - " + number2 + " = " +  (number1 - number2));
	        break;
	    case '*':
	     
	        System.out.println(number1 + " * " + number2 + " = " +   (number1 * number2) );
	        break;
	    case '/':
	    	
	    	result =((double)number1 )/ number2;
	    	
	    	   
	    	if (number2 !=0)	
	        
	        System.out.println(number1 + " / " + number2 + " = " +   result);
	    	
	    	 if (number2 ==0) {
	    		
	    		
	    		System.out.println("on ne peut pas diviser par 0");
	    		
	    	}
	    	
	        break;
	     default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	}

}
