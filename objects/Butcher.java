class Butcher{
		String name;
		int avgInDay;
		int experience;
		
		Butcher()
		{
			System.out.println("invoking no-arg const of Butcher");
			
		}
		
		Butcher(String name,int avgInDay)
		{
			System.out.println("invoking string,int const of Butcher");
			this.name=name;
			this.avgInDay=avgInDay;
		}

		
		Butcher(String name,int avgInDay,int experience)
		{			
			this(name,avgInDay);
			this.experience=experience;
			System.out.println("invoking string,int,int const of Butcher");
		}

}