package polymorphism_homwork_kimsanghyeon.practice3.controller;

import java.util.Random;

import polymorphism_homwork_kimsanghyeon.practice3.model.vo.Animal;
import polymorphism_homwork_kimsanghyeon.practice3.model.vo.Cat;
import polymorphism_homwork_kimsanghyeon.practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animal = new Animal[5];
		
		for(int i =0; i<5; i++) {
			
			int random = (int) ((Math.random()*10)+1);
			
			if(random >5) {
				animal[i] = new Dog((i+1)+"식이","강아지", (i+1)*2	);
				animal[i].speak();
			} else if (random <=5) {
				String colorstr =(random>3)? "치즈색" : "하얀색";
				
				animal[i] = new Cat((i+1)+"냥이","고양이","뒷골목", colorstr);
				animal[i].speak();
			}
		}
		
		
		
		
		
	}

}
