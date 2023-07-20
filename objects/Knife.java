class Knife{
 
       boolean sharp;
	   String material;
	   double price;
	   char size;
	   String type;

	   Knife()
	   {
		   this(true,"Iron",300);
		   System.out.println("invoking no-arg cosnt of Knife");
	   }
	   
	   Knife(boolean sharp)
	   {
			
		   this.sharp=sharp;
		   System.out.println("invoking boolean const of Knife");
	   }
	   
	   
	   Knife(boolean sharp,String material)
	   {
		   this(sharp);
		   this.material=material;
		   System.out.println("invoking boolean,string const of Knife");
	   }
	   
	   Knife(boolean sharp,String material,double price)
	   {
		   this(sharp,material);
		   this.price=price;
		   System.out.println("invoking boolean,string,double const of Knife");
	   }
	   
	   Knife(boolean sharp,String material,double price,char size )
	   {
		   this(sharp,material,price);
		   this.size=size;
		   System.out.println("invoking boolean,string,double,char const of Knife");
	   }

	   
	   Knife(boolean sharp,String material,double price,char size,String type )
	   {
		   this(sharp,material,price,size);
		   this.type=type;
		   System.out.println("invoking boolean,string,double,char,string const of Knife");
	   }
}