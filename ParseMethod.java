package LMS;

public class ParseMethod {
public static void main(String[]args) {
	int num1= Integer.parseInt(args[0]);
	boolean isPresent=Boolean.parseBoolean(args[1]);
	float num2= Float.parseFloat(args[2]);
	long num3=Long.parseLong(args[3]);
	double num4=Double.parseDouble(args[4]);
	char letter=args[5].charAt(0);
	
	System.out.println(num1);
	System.out.println(isPresent);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(letter);
}
}
