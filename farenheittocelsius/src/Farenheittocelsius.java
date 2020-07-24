


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DELL
 */
public class Farenheittocelsius {
     double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
	public static void main(String arg[])	
	{
	    double a,c;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Fahrenheit temperature");
                   a=sc.nextDouble();
	    Farenheittocelsius fah=new Farenheittocelsius( );
	    double result=fah.celsius(a);	
	    System.out.println("Celsius temperature is = "+result);		  	  	     
	} 	
    
}
