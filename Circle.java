package SemuaCircle.CircleKecil; //create package here
//java.sun.com --> package com.sun.java
public class Circle 
{
	//field of attribute
	private double jejari =1, x;
	public static int bilObjekWujud = 0; //static field or attribute






	//default constructor
	public Circle() 
	{
		jejari = 1;
		x = 5;
		bilObjekWujud++;
	}

	//overload constructor 1 parameter
	public Circle(double jejari)
	{
		//this(); //call default constructor //must be in first statement
		this.jejari=jejari;
		x=5;
		//this(jejari,5);
		bilObjekWujud++;
	}

	//overload constructor 2 parameter
	public Circle(double jejari,String name)
	{
		this.jejari=jejari;
		System.out.println("Jejari " + jejari + "\nName " + name);
		bilObjekWujud++;
	}

	public Circle(double jejari,double x)
	{
		this.jejari = jejari;
		this.x = x;
		bilObjekWujud++;
	}

	//overload method toString()
	public String toString()
	{
		String tentangCircle;
		tentangCircle = "Bil objek ialah " + bilObjekWujud;
		//tentangCircle = "Jejari = " + jejari + "\nValue x = " + x +  "\nLuas = " + KiraLuas();
		return tentangCircle;
	}


	




	//method
	/*public double KiraLuas()
	{
		return jejari * jejari * Math.PI;
	}*/

	public double KiraLuas()
	{
		return GetJejari() * GetJejari() * Math.PI;
	}

	//setter accessor
	public void SetJejari(double jejari)
	{
		this.jejari=jejari;
		//System.out.println("Jejari " + jejari);
	}

	//getter muatator
	public double GetJejari()
	{
		return jejari;
	}

	public static double UkurLilit (double jejari)
	{
		return 2 * Math.PI * jejari; 
	}
}