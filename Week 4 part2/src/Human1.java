import java.util.Scanner;
public class Human1 {

	Scanner sc=new Scanner(System.in);
	String Name;
	int Age;
	String Sex;
	
	void printHuman(){
		System.out.println("Please Enter Your Name");
		String a= sc.nextLine();
		System.out.println("Please Enter Your Age");
		int b= sc.nextInt();
		System.out.println("Please Enter Your Sex");
		String x= sc.next();
		System.out.println("Name : " + a);
		System.out.println("Age : " + b);
		System.out.println("Sex : " + x);
	}
	
	void printProperties() {
		String d=sc.nextLine();
		System.out.println("How do you walk?");
		String a=sc.nextLine();
		System.out.println("How do you talk to someone?");
		String b=sc.nextLine();
		String Operation = ("1.Walk = " +a + "\n" + "2.Speak = " + b +"\n");
		System.out.print("Operation : \n" + Operation);
	}
	
	void printClothes() {
		System.out.println("How many types of clothes are your choice for the day ?");
		int clothes=sc.nextInt();
		String[]choice=new String[clothes];
		String d=sc.nextLine();
		System.out.println("please enter the dress that has been your choice");
		for(int i=0;i<choice.length;i++ ) {
			choice[i]=sc.nextLine();
		}
		System.out.println("Clothes that are always chosen :- ");
		for(int i=0;i<choice.length;i++ ) {
			System.out.println("- "+choice[i]);
		}
	}
	
	void printBmi() {
		System.out.println("Please enter height in cm and weight in kg");
		double height= sc.nextDouble();
		double weight= sc.nextDouble();
		double bmi,c=0;
		c=height/100;
		bmi=weight/(c*c);
		double roundoff = Math.round(bmi*100)/100;
		System.out.println("Your Bmi is = " + roundoff);
	}
}