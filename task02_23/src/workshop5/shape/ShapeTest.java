package workshop5.shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shape = new Shape[6];
		
		shape[0] = new Triangle(7,5,"blue");
		shape[1] = new Rectangle(4,6,"blue");
		
		shape[2] = new Triangle(6,7,"red");
		shape[3] = new Rectangle(8,3,"red");
		
		shape[4] = new Triangle(9,8,"white");
		shape[5] = new Rectangle(5,7,"white");
		
		
		for (Shape s : shape) {
				
				if( s instanceof Triangle) {
						System.out.println("trianlge");
					
						System.out.println(s.getArea());
						System.out.println();
						
				} else if( s instanceof Rectangle ) {
						System.out.println("rectangle");
					
						System.out.println(s.getArea());
						System.out.println();
				}
			
			
			
			
			
			
				if( s instanceof Triangle) {
						System.out.println("resized_trianlge");
						
					Triangle t = (Triangle) s;
					t.setResize(5);
					
						System.out.println(t.getArea());
						System.out.println();
				} else if( s instanceof Rectangle ) {
						System.out.println("resized_rectangle");
						
					Rectangle r= (Rectangle) s;
					r.setResize(5);
					
						System.out.println(r.getArea());
						System.out.println();
				}
		}
	}
}
