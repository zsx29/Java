package sub1;

public class RemoteLG implements RemoteControl{

	public void powerOn() {
		System.out.println("LG - PowerOn....");
	}

	@Override
	public void powerOff() {
		System.out.println("LG - PowerOff....");
		
	}

	@Override
	public void chUp() {
		System.out.println("LG - chUp....");
		
	}

	@Override
	public void chDown() {
		System.out.println("LG - chDown....");
		
	}
}
