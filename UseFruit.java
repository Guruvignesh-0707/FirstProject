package for5;

public class UseFruit {
	public static void main(String[] args) {
		Fruit fruit1=new Fruit();
		fruit1.name="mango";
		fruit1.price=250;
		fruit1.isHybrid=true;
		
		Fruit fruit2=new Fruit();
		fruit2.name="Apple";
		fruit2.price=200;
		fruit2.isHybrid=false;
		
		Fruit fruit3=new Fruit();
		fruit3.name="Jackfruit";
		fruit3.price=500;
		fruit3.isHybrid=true;
		
		Fruit fruit4=new Fruit();
		fruit4.name="watermilon";
		fruit4.price=200;
		fruit4.isHybrid=true;
		
		
		Fruit[]fruits= {fruit1,fruit2,fruit3,fruit4};
		int maxlength=fruits[0].name.length();
		String maxFruit="fruits[0].name";
		int maxPrice=fruits[0].price;
		boolean maxHybrid=fruits[0].isHybrid;
//		for(Fruit i:fruits) {//enhance type
//			if(maxlength<i.name.length()) {
//				maxlength=i.name.length();
//				maxFruit=i.name;
//				maxPrice=i.price;
//				maxHybrid=i.isHybrid;
//			}
//			
//		}
		
		//System.out.println(maxFruit+" "+maxPrice+" "+maxHybrid);
		//differnt type to create object;
		int maxlength1=fruits[0].name.length();
		Fruit maxFruit2=fruits[0];
		for(Fruit i:fruits) {
			if(maxlength1<i.name.length()) {
				maxlength1=i.name.length();
				maxFruit2=i;
				
			}
		}System.out.println(maxFruit2.name+" "+maxFruit2.price+" "+maxFruit2.isHybrid);
		
		
	}

}
