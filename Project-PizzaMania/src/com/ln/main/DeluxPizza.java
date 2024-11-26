package com.ln.main;

public class DeluxPizza extends Pizza
{

	public DeluxPizza(Boolean veg)
	{
		super(veg);
		if(this.veg)
	      {
	        this.price = 550;
	      }else {
			this.price=600;
		  }
	      this.basePizzaPrice = this.price;

	}
	@Override
	public void addExtraCheese()
	{
		System.out.println("ExtraCheese is free for DeluxPizza");
	}
	@Override
	public void addExtraToppings()
	{
		System.out.println("ExtraToppings is free for DeluxPizza");
	}
	@Override
	public void takeAway() 
	{
		super.takeAway();
	}
	@Override
	public void getBill() 
	{
		super.getBill();
	}
	


}
