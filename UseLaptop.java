package for5;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		laptop1.ram=5;
		laptop1.color="block";
		laptop1.modelNumber="Lenovo523";
		laptop1.isTouchScreen=true;
		
		Laptop laptop2=new Laptop();
		laptop2.ram=6;
		laptop2.color="red";
		laptop2.modelNumber="hp3425";
		laptop2.isTouchScreen=false;
		
		Laptop laptop3=new Laptop();
		laptop3.ram=7;
		laptop3.color="white";
		laptop3.modelNumber="thinkpad56";
		laptop3.isTouchScreen=true;
		
		Laptop laptop4=new Laptop();
		laptop4.ram=9;
		laptop4.color="blue";
		laptop4.modelNumber="dwell778";
		laptop4.isTouchScreen=true;
		
		Laptop[]laptops= {laptop1,laptop2,laptop3,laptop4};
		for(Laptop i:laptops) {
			if(i.ram%2==0) {
				System.out.println(i.modelNumber.toUpperCase());
				
			}else {
				System.out.println(i.modelNumber.toLowerCase());
			}
		}
		
		
	}

}
