
public class Emp implements Comparable {
	
	public String name;
	double mileage;
	 Emp()
	 {
		 
	 }
	 Emp(String name,double mileage){
		 this.name=name;
		 this.mileage=mileage;
	 }
	 Emp(String name){
		 this.name=name;
	 }
	 public int compareTo(Object obj) {
		 //System.out.println(mileage);
		return this.name.compareTo(((Emp)obj).name);
			
		
	 }
}
