class Perfume{

 
     static String brand;
	 static String gstNo;
	 String fragrance;
	 String manfDate;
	 
	 
	 Perfume(String fragrance,String manfDate)
	 {
		this.fragrance=fragrance;
		 this.manfDate=manfDate;
		 System.out.println("invoking string,string const of Perfume");
	 }
	 
	 //init static variables, during class loading
	 static{
		 brand="CR7";
		 gstNo="09AAQFC6247D1Z9";
		 System.out.println("invoking static block in Perfume");
	 }
	 
	 static void printStatic()
	 {
		 System.out.println("running printStatic in Perfume");
		 System.out.println(brand);
		 System.out.println(gstNo);
	 }
	 
	 
	 void printInstance()
	 {
		 System.out.println("running printInstance in Perfume");
		 System.out.println(this.fragrance);
		 System.out.println(this.manfDate);
	 }
	 

}