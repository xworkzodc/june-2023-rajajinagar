class BeerKiller{


	public static void main(String[] values)
	{
    
	   System.out.println("invoking main in BeerKiller");
	   
	   System.out.println(Beer.brand);//??King Fisher
		System.out.println(Beer.stateManufactured);//null 
	   
	   Beer beer=new Beer();
			System.out.println(Beer.brand);	// King Fisher
	   	   System.out.println(beer.price);//0
		   System.out.println(beer.quantity);//0
		   System.out.println(Beer.stateManufactured);//null
	   
	   
	     Beer.brand="Tuborg";
		 beer.price=180;
		 beer.quantity=750;
		 Beer.stateManufactured="Karnataka";
	   
	   
	   System.out.println("BEER 1");
	   
	   Beer beer1=new Beer();
	   beer1.price=190;
	   beer1.quantity=750;
	   System.out.println(Beer.brand);	// Tuborg
	   System.out.println(beer1.price);//190 
		System.out.println(beer1.quantity);//750
		System.out.println(Beer.stateManufactured);//Karnataka

	 
	}

}