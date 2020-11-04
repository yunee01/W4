import SemuaCircle.Circle; //import specific class Circle 

public class DriverCircle
{
	public static void main(String[] args)
	{
		//object or reference
		Circle bulat = new Circle();
		System.out.println("\n\nPrint apa ? (bulat) \n" + bulat);

		Circle bulat1 = new Circle(76);
		System.out.println("\n\nPrint apa ? (bulat1) \n" + bulat1);

		Circle bulat2 = new Circle(8,"DITP 2113");
		System.out.println("\n\nPrint apa ? (bulat2) \n" + bulat2);

		Circle bulat3 = new Circle(8,3);
		System.out.println("\n\nPrint apa ? (bulat3) \n" + bulat3);

		//string is a reference
		/*String s = "DITP3113";
		System.out.println("\n\nString s : " + s);

		//call method to string
		System.out.println("\n\nPrint apa ? (bulat) \n" + bulat.toString());
		System.out.println("\n\nPrint apa ? (bulat1) \n" + bulat1);

		//api java to string


		System.out.println("\nLuas ialah " + bulat.KiraLuas());	
		System.out.format("\nLuas ialah %2.2f " , bulat.KiraLuas());	
		System.out.println("\nJejari bulat " + bulat.GetJejari());

		System.out.println("\nJejari bulat1 " + bulat1.GetJejari());

		bulat2.SetJejari(35);
		System.out.println("\nJejari bulat2 " + bulat2.GetJejari());*/

		//call the outer one
		System.out.println("Diameter = " + Diameter(4));//withoout calling object
		System.out.println("Diameter = " + Diameter(bulat3.GetJejari()));

		//call the one in circle.java
		//have to declare class of the method
		System.out.println("Ukurlilit = " + Circle.UkurLilit(bulat3.GetJejari()));

		System.out.println("Area = " + CalArea(bulat2));

		System.out.println("Display = " + Display());
 
	}

	//method static that return a reference (object)
	public static Circle Display()
	{
		int j = 5;
		return new Circle(j);// create and return object
	}

	//static method that accept pass by reference 
	//accept object as its parameter 
	public static double CalArea(Circle b)
	{
		return b.GetJejari() * b.GetJejari() * Math.PI;
	}


	//static method at outter main
	//call method without go through main 
	//evreryone can call this method
	public static double Diameter (double jejari)
	{
		return 2 * Math.PI * jejari; 
	}
}