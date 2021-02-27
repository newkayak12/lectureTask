package workshop2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		Integer num1 = Integer.parseInt(args[0]);
		Integer num2 = Integer.parseInt(args[1]);
		Integer num3 = Integer.parseInt(args[2]);
		
		
		List<Integer> num = new ArrayList<>();
			num.add(num1);
			num.add(num2);
			num.add(num3);
		Collections.sort(num);
		
		
		System.out.println("최대값 : " + num.get(2) +  "  최소값 : " + num.get(0));
	}
}
