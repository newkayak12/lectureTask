package workshop5.mobile;

public class Ltab extends Mobile{
	
	public Ltab() {
		// TODO Auto-generated constructor stub
	}
	

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		int result=super.getBatterySize()-(10*time);
		
		return result;
	}

	@Override
	public int charge(int time) {
		int result = super.getBatterySize()+(10*time);
		
		return result;
	}

	
}
