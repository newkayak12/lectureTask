package workshop5.shape;

public class Triangle extends Shape implements Resize{
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Triangle (int width, int height, String color) {
		super(width, height, color);
	}
	
	
	@Override
	public double getArea() {

		
		return (super.getWidth() * super.getHeight())/2;
	}

	@Override
	public void setResize(int size) {
		super.setHeight(super.getHeight() + size);
	}
	
	
	
}
