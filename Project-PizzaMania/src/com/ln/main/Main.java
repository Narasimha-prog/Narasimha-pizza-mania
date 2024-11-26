package com.ln.main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

System.out.println("---------------------Welcome to Pizzamania-----------------------\n");
System.out.println("Which pizza:(1.Veg Pizza  2.Non-Veg Pizza 3.Delux Veg Pizza 4.Delux Non-Vegn Pizza )===>");
Scanner s = new Scanner(System.in);
 try(s;){
xyz:while(true)
{   String p= s.nextLine();
      p.length();
	 char c =Character.toLowerCase(p.charAt( p.length()-1));
	 int ch = Character.getNumericValue(c);
	 
	if(ch >=1 && ch <=4 && p.length()==1 && Character.isDigit(c))
	{ 
   switch(ch) {
case 1->
        { 
	     Pizza vegPizza = new Pizza(true);
         vegPizza.addExtraToppings();
         vegPizza.addExtraCheese();
         vegPizza.takeAway();
         vegPizza.getBill();
         break xyz;
        
        }
case 2-> 
        {
	     Pizza nonvegPizza = new Pizza(false);
         nonvegPizza.addExtraToppings();
         nonvegPizza.addExtraCheese();
         nonvegPizza.takeAway();
         nonvegPizza.getBill();
         break xyz;
         }
	
case 3->
      {
	   DeluxPizza dveg = new DeluxPizza(true);
       dveg.addExtraToppings();
       dveg.addExtraCheese();
       dveg.takeAway();
       dveg.getBill();
       break xyz;
        }

case 4->{
	     DeluxPizza nonveg = new DeluxPizza(false);
         nonveg.addExtraToppings();
         nonveg.addExtraCheese();
         nonveg.takeAway();
         nonveg.getBill();
         break xyz;
        }
        
}
	}//end of if
	else 
	   {
		System.out.println("Enter a valid number");
		continue;
	   }
		
}//end of while
 }//end of method
 catch (Exception e) {
	    System.out.println(e.getMessage());
}
	}

}
