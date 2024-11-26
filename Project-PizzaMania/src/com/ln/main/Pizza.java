package com.ln.main;

import java.util.Scanner;

public class Pizza 
{
  protected int price;
  protected Boolean veg;
  protected int extraCheesePrice=100;
  protected int extraToppingsPrice =150;
  protected int backPackPrice=20;
  protected int basePizzaPrice;
  protected boolean isExtraCheeseAdded=false;
  protected boolean isExtraToppingsAdded=false;
  protected boolean isOptedForTakeaway=false;
  //for child and same package 

  Scanner in = new Scanner(System.in);
  
  public Pizza(Boolean veg)
  {
      this.veg=veg;
      if(this.veg)
      {
    	  this.price = 300;
      }else {
		this.price=400;
	  }
      basePizzaPrice = this.price;
     
    }
  
  
	  
    public void addExtraCheese() 
    {
	 System.out.println("Extra cheese (y/n)? =>");
	 a:while(true)
	  {
		 String p = in.nextLine();
		 int len= p.length();
		 char ch =Character.toLowerCase(p.charAt( len-1));
	 if((ch=='y' || ch=='n') && len ==1 && Character.isAlphabetic(ch))
	 {
      switch (ch)
      {
	case 'y' ->
	         {       
	         isExtraCheeseAdded = true; 
	         this.price += extraCheesePrice;
	         break a;
	         }
	case 'n' ->{
	          isExtraCheeseAdded=false;
	          break a;
	          }
	
	}//end of switch
	 }//end of if
	 else {
		System.out.println("Enter a valid Alphabet");
	    }
	}//loop of loop
  } 
    public void addExtraToppings(){
   	 System.out.println("Want Extra Topping (y/n)? =>");
   	 b:while(true)
	  {
   		String p = in.nextLine();
		 int len= p.length();
		 char ch =Character.toLowerCase(p.charAt( len-1));
	 if((ch=='y' || ch=='n') && len ==1 && Character.isAlphabetic(ch))
   		 {
   	 
         switch (ch) {
   	case 'y' ->
   	         {       
   	         isExtraToppingsAdded = true; 
   	         this.price += extraToppingsPrice;
   	         break b;
   	         }
   	case 'n' ->
   	          {isExtraToppingsAdded=false;
   	          break b;
   	          }
         }//end of switch
   		 }//end of if
         
         else 
         {
     		System.out.println("Enter a valid Alphabet");
     	 }   
   	
	  }//end of while
   	}// end of method
    public void takeAway(){
      	 System.out.println("Want TakeAway (y/n)? =>");
      	 c:while(true)
   	  {
      		String p = in.nextLine();
   		 int len= p.length();
   		 char ch =Character.toLowerCase(p.charAt( len-1));
   	 if((ch=='y' || ch=='n') && len ==1 && Character.isAlphabetic(ch))
   		 {
   	 
            switch (ch) {
      	case 'y' ->
      	         {       
      	         isOptedForTakeaway = true; 
      	         this.price += backPackPrice;
      	         break c;
      	         }
      	case 'n' ->
      	          {isOptedForTakeaway=false;
      	            break c;
      	          }
      	}//end of switch
   		 }//end of if
      	 else 
         {
     		System.out.println("Enter a valid Alphabet");
     	 } 
   	  }//end of while   
      	}//end of method
    
    public void getBill() 
    {
    	   String bill ="";
       System.out.println("Pizza: "+basePizzaPrice);
       
       if (isExtraCheeseAdded)
       {  
		  bill += "Extra Cheese: "+extraCheesePrice+ "\n";
	   }
        if (isExtraToppingsAdded) 
       {
		   bill += "Extra Toppings: "+extraToppingsPrice+ "\n";   
       }
	   if (isOptedForTakeaway) 
		{
			bill += "Take away: "+backPackPrice+ "\n";
		}
		bill += "\nTotal Ammount: "+this.price +"\n";
		System.out.println(bill);
		System.out.println("\n\n\nThanks you!!!! Visit Again.....");
		System.out.println("------------------------------------------");
		
	   }
	}
    

