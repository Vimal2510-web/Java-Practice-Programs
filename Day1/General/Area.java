package General;

// Program to calculate the area

public class Area {
	
	 Area(int side){
		
		int areaSq = side * side ;
		System.out.println("The area of square : " + areaSq);
	}
	
	 Area(int length, int breadth) {
		
		int areaRec = length * breadth;
		
		System.out.println("The area of rectangle : " + areaRec);
	}
	
	public static void main(String[] args) {
		
		Area sq = new Area(5);
		Area rec = new Area(3,8);
		
	}

}
