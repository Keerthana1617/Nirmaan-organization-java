package Day3;

public class Operator {
		    public static void main(String args[]) {
		        System.out.println("Arithmetic operator:");
		        int firstNum = 10;
		        int secondNum = 20;
		        int addition = firstNum + secondNum;
		        int subtraction = firstNum - secondNum;  
		        int multiplication = firstNum * secondNum;
		        int division = firstNum / secondNum;
		        int modulus = firstNum % secondNum;
		        
		        System.out.println("Addition: " + addition);
		        System.out.println("Subtraction: " + subtraction);  
		        System.out.println("Multiplication: " + multiplication);
		        System.out.println("Division: " + division);
		        System.out.println("Modulus: " + modulus);
		        System.out.println("Relation operator");
		        boolean a=firstNum > secondNum;
		        System.out.println("10>20:"+a);
		        boolean b=firstNum < secondNum;
		        System.out.println("10<20:"+b);
		        boolean c=firstNum >= secondNum;
		        System.out.println("10>=20:"+c);
		        boolean d=firstNum <= secondNum;
		        System.out.println("10<=20:"+d);
		        boolean e=firstNum == secondNum;
		        System.out.println("10==20:"+e);
		        boolean f=firstNum != secondNum;
		        System.out.println("10!=20:"+f);		
		        
		    }
		}

		

