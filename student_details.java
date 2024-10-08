package students_project;

public class student_details {
	
	private int id;
	private String name;
	private String city;
	private int classes;
	private double percentage;
	
	public student_details(int id,String name,String city,int classes,double percentage) 
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.classes=classes;
		this.percentage=percentage;
	}
	
	 int getid()
	{
		return id;
	}
	 String getname()
	 {
		 return name;
	 }
	 String getcity()
	 {
		 return city;
	 }
	 int getclasses()
	{
		return classes;
	}
	 double getpercentage()
	 {
		 return percentage;
	 }
	 
	 void setid(int id)
	 {
		 this.id=id;
	 }
	 void setname(String name)
	 {
		 this.name=name;
	 }
	 void setcity(String city)
	 {
		 this.city=city;
	 }
	 void setclasses(int classes)
	 {
		 this.classes=classes;
	 }
	 void setpercentage(double percentage)
	 {
		 this.percentage=percentage;
	 }
	 
	 public String toString()
	 {
		 return "[id= "+id+"name="+name+"city= "+city+"class= "+classes+"precentage= "+percentage+"\n";
	 }

}
