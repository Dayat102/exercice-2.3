import java.util.Scanner;
public class main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Human1 male=new Human1(); //create first new object Human
		male.printHuman();
		male.printProperties();
		male.printClothes();
		male.printBmi();

		System.out.println();
		
		Human1 female=new Human1();//create second new object Human
		female.printHuman();
		female.printProperties();
		female.printClothes();
		female.printBmi();
		System.out.println();
				

	}

}
