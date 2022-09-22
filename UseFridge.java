package LMS;

public class UseFridge {
	public static void main(String[]args) {
		String[] word1=args[0].split("@");
		Fridge fridge1=new Fridge();
		fridge1.brand=word1[0].toUpperCase();
		fridge1.price=Integer.parseInt(word1[1]);
		fridge1.color=word1[2].toLowerCase();
		fridge1.taxAmount=Integer.parseInt(word1[3]);
		fridge1.netprice=fridge1.price+fridge1.taxAmount;
		
		String[] word2=args[0].split("@");
		Fridge fridge2=new Fridge();
		fridge2.brand=word2[0].toUpperCase();
		fridge2.price=Integer.parseInt(word2[1]);
		fridge2.color=word2[2].toLowerCase();
		fridge2.taxAmount=Integer.parseInt(word2[3]);
		fridge2.netprice=fridge2.price+fridge2.taxAmount;
		
		System.out.println("Brand = "+fridge1.brand+" , "+fridge2.brand+
				" Color = "+fridge1.color+" , "+fridge2.color+
				"NetPrice = "+fridge1.netprice+" , "+fridge2.netprice);
		
		
		
	}

}
