package for5;

public class UseMarker {
	public static void main(String[] args) {
		Marker marker1=new Marker();
		marker1.brand="Camalin";
		marker1.price=250;
		marker1.size=4;
		marker1.isRefillable=true;
		
		
		Marker marker2=new Marker();
		marker2.brand="Apsara";
		marker2.price=200;
		marker2.size=2;
		marker2.isRefillable=true;
		
		Marker marker3=new Marker();
		marker3.brand="Nataraj";
		marker3.price=220;
		marker3.size=4;
		marker3.isRefillable=true;
		
		Marker[]markers=new Marker[3];
		markers[0]=marker1;
		markers[1]=marker2;
		markers[2]=marker3;
		
		
		int maxlength=markers[0].brand.length();
		String maxbrand="markers[0].brand";
		int maxPrice=markers[0].price;
		boolean maxRefillable=markers[0].isRefillable;
		for(int i=0; i<markers.length; i++) {
			if(maxlength<markers[i].brand.length()) {
				maxlength=markers[i].brand.length();
				maxPrice=markers[i].price;
				maxRefillable=markers[i].isRefillable;
				
				
			}	
			}
			System.out.println("Max Length of Brand:"+maxlength+", Max Price: "+maxPrice+", MaxRefillable :"+maxRefillable);
			
		}
		
		
	}

