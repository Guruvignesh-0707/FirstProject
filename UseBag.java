package for5;

public class UseBag {
	public static void main(String[] args) {
		Bag bag1=new Bag();
		bag1.type="casual";
		bag1.noOfZips=5;
		bag1.isWaterProof=true;
		
		
		Bag bag2=new Bag();
		bag2.type="formal";
		bag2.noOfZips=4;
		bag2.isWaterProof=false;
		
		
		Bag bag3=new Bag();
		bag3.type="school bag";
		bag3.noOfZips=8;
		bag3.isWaterProof=true;
		
		Bag[]bags= {bag1,bag2,bag3};
		int maxZips=bags[0].noOfZips;
		String maxbagtype="bags[0].bagstype";
		for(int i=0; i<bags.length; i++) {
			if(bags[i].isWaterProof==true) {
				//System.out.println(bags[i].isWaterProof);
			}
		}
			
			for(Bag i: bags) {
				if(maxZips<i.noOfZips) {
					maxZips=i.noOfZips;
					maxbagtype=i.type;
				}
				
		}System.out.println(maxZips);
		System.out.println(maxbagtype);
		
	}

}
