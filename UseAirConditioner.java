package for5;

public class UseAirConditioner {
	public static void main(String[] args) {
		AirConditioner airConditioner1=new AirConditioner();
		airConditioner1.brand="LG";
		airConditioner1.price=40000;
		airConditioner1.color="red";
		airConditioner1.isFiveStar=true;
		
		AirConditioner airConditioner2=new AirConditioner();
		airConditioner2.brand="Samsung";
		airConditioner2.price=35000;
		airConditioner2.color="blue";
		airConditioner2.isFiveStar=false;
		
		AirConditioner airConditioner3=new AirConditioner();
		airConditioner3.brand="BlueStar";
		airConditioner3.price=42000;
		airConditioner3.color="yellow";
		airConditioner3.isFiveStar=true;
		
		
		AirConditioner airConditioner4=new AirConditioner();
		airConditioner4.brand="Ogenral";
		airConditioner4.price=44000;
		airConditioner4.color="green";
		airConditioner4.isFiveStar=true;
		
		
		AirConditioner[]airConditioners= {airConditioner1,airConditioner2,airConditioner3,airConditioner4};
		
		for(int i=0; i<airConditioners.length; i++) {
			if(airConditioners[i].isFiveStar==true) {
				System.out.println(airConditioners[i].brand+":"+(airConditioners[i].price-(airConditioners[i].price*8/100)));
			}
		}
	}

}
