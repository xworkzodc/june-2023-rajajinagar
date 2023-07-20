class ChickenKiller{


public static void main(String[] values)
{
	
	System.out.println("invoking main in ChickenKiller");
	
	
	Chicken chicken=new Chicken(130,"Farm");
	//Chicken(double,String)--->Chicken()--->super()
	
	
	Butcher butcher=new Butcher("Tom Cruise",6,40);//--this(name,avginDay)-->super()
	
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
	Knife knife=new Knife(true,"Steel",250);//--this(true,steel)-->this(true)-->super
	
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	Knife knife1=new Knife();// 
	
	
	
	
	
	
	
	
}


}