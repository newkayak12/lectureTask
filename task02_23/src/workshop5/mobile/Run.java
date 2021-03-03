package workshop5.mobile;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Mobile l = new Ltab("Ltab", 500, "AP-01");
			Mobile o = new Otab("Otab", 1000, "AND-20");
				System.out.println("Mobile \tBattery   OS");
				System.out.println("-----------------------");
				System.out.println(l.getMobileName() +"\t" +l.getBatterySize() +"\t" +l.getOsType());
				System.out.println(o.getMobileName() +"\t" +o.getBatterySize() +"\t" +o.getOsType());
				
			l.charge(10);
			o.charge(10);
				System.out.println("\n10분 충전");
				System.out.println("Mobile \tBattery   OS");
				System.out.println("-----------------------");
				System.out.println(l.getMobileName() +"\t" +l.getBatterySize() +"\t" +l.getOsType());
				System.out.println(o.getMobileName() +"\t" +o.getBatterySize() +"\t" +o.getOsType());
				
			l.operate(5);
			o.operate(5);
				System.out.println("\n5분 통화");
				System.out.println("Mobile \tBattery   OS");
				System.out.println("-----------------------");
				System.out.println(l.getMobileName() +"\t" +l.getBatterySize() +"\t" +l.getOsType());
				System.out.println(o.getMobileName() +"\t" +o.getBatterySize() +"\t" +o.getOsType());
	}

}
