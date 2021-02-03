package polymorphism_homwork_kimsanghyeon.practice3.model.vo;

public class Cat extends Animal {
	private String location, color;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Cat(String name, String kind, String location, String color) {
		super(name, kind);
		this.location = location;
		this.color = color;
	}
	
	

	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public void speak() {
		String hello = super.toString()+ location+"에 서식하며, 색상은 "+color+"입니다.";
		System.out.println(hello);
		
	}
	
	

}
