class Chicken{

      double price;
	  double weight;
	  String type;
	  // ur heart is not good: Implicitly
	  Chicken()
	  {    
		  System.out.println("invoking no-arg Const of Chicken");
	  }
	  
	  Chicken(double price)
	  {
		  super();
		  System.out.println("invoking double Const of Chicken");
		  this.price=price;
	  }
	  
	  Chicken(double price,String type)
	  {		  
		  this();//no-arg cosnt of same class 
		  System.out.println("invoking double,String Const of Chicken");
		  this.price=price;
		  this.type=type;
	  }

}