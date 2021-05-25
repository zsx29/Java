package sub1;

public class RemoteSamsung implements RemoteControl {

	public void powerOn() {
		System.out.println("Samsung - PowerOn....");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung - PowerOff....");
		
	}

	@Override
	public void chUp() {
		System.out.println("Samsung - chUp....");
		
	}

	@Override
	public void chDown() {
		System.out.println("Samsung - chDown....");
		
	}
}
