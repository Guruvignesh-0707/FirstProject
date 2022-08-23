package for5;

public class UseStudent {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="Jeeva";
		student1.age=20;
		student1.roolNumber=25;
		student1.isPresent=true;
		
		Student student2=new Student();
		student2.name="Guruvignesh";
		student2.age=21;
		student2.roolNumber=28;
		student2.isPresent=false;
		
		Student student3=new Student();
		student3.name="kalai";
		student3.age=20;
		student3.roolNumber=23;
		student3.isPresent=true;
		
		Student student4=new Student();
		student4.name="Sivaraman";
		student4.age=22;
		student4.roolNumber=18;
		student4.isPresent=true;
		
		Student student5=new Student();
		student5.name="kabilan";
		student5.age=24;
		student5.roolNumber=10;
		student5.isPresent=true;
		
		Student student6=new Student();
		student6.name="Sanker";
		student6.age=26;
		student6.roolNumber=12;
		student6.isPresent=false;
		
		Student[]students=new Student[6];
		students[0]=student1;
		students[1]=student2;
		students[2]=student3;
		students[3]=student4;
		students[4]=student5;
		students[5]=student6;
		int countA=0;
		int countB=0;
		int countC=0;
		for(int i=0; i<students.length; i++) {
			if(students[i].name.charAt(0)>='A'&&students[i].name.charAt(0)<='H') {
				countA++;
				System.out.println(students[i].name+": A -section");
				
				
			}else if(students[i].name.charAt(0)>='I'&&students[i].name.charAt(0)<='N'){
				countB++;
				System.out.println(students[i].name+": B-section");
				
				
			}else if(students[i].name.charAt(0)>='O'&&students[i].name.charAt(0)<='Z') {
				countC++;
				System.out.println(students[i].name+": C-section");
				
			}
		
		}System.out.println(" A-section count is :"+countA++);
		System.out.println(" B-section count is :"+countB++);
		System.out.println(" C-section count is :"+countC++);
	}
}
