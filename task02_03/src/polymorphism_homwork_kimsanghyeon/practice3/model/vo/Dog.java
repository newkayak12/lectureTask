package polymorphism_homwork_kimsanghyeon.practice3.model.vo;

public class Dog extends Animal {
	
	public static final String PLACE = "애견카페";
	private int weight;
	
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, String kind, int weight) {
		super(name, kind);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void speak() {
		String hello = super.toString()+ " 몸무게는" +weight+ "kg 입니다.";
		System.out.println(hello);
	}
}
