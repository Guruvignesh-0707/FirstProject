package for5;

public class UseFan {
	public static void main(String[] args) {
		System.out.println("This is fan class");
		Fan fan1=new Fan();
		fan1.brand="Usha";
		fan1.price=2500;
		fan1.color="block";
		fan1.isFourWings=true;
		
		Fan fan2=new Fan();
		fan2.brand="Cromptan";
		fan2.price=2540;
		fan2.color="white";
		fan2.isFourWings=false;
		
		Fan fan3=new Fan();
		fan3.brand="Philips";
		fan3.price=2040;
		fan3.color="white";
		fan3.isFourWings=false;
		
		Fan[]fans=new Fan[3];
		fans[0]=fan1;
		fans[1]=fan2;
		fans[2]=fan3;
		
		int maxPrice=fans[0].price;
		for(int i=0; i<fans.length; i++) {
			if(maxPrice<fans[i].price) { 
				maxPrice=fans[i].price;
			}
		}System.out.println(maxPrice);
		
	}

}
