package LMS;

public class Excercise4 {
	public static void main(String[]args) {
     String[] name=args[0].split(",");
     int id=Integer.parseInt(name[1]);
     boolean isMale=Boolean.parseBoolean(name[2]);
     long mobileNo=Long.parseLong(name[4]);
     System.out.println("Name: "+name[0]);
     System.out.println("RollNo: "+id);
     System.out.println("Mail Id: "+name[3]);
     System.out.println("Is Present: "+isMale);
	System.out.println("Mobile No: "+ mobileNo);
    }
}

