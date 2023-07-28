class PerfumeKiller{


	public static void main(String[] values)
	{
    	   System.out.println("invoking main in PerfumeKiller");
		   
		   
		   Perfume perfume=new Perfume("Lily","21/07/2023");
		   Perfume.printStatic();
		   perfume.printInstance();
		   
		   
			Perfume perfume1=new Perfume("Jasmine","22/07/2023");
			Perfume.printStatic();
			perfume1.printInstance();
	}
	
}	