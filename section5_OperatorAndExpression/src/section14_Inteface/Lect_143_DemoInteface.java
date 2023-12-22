package section14_Inteface;

class phone{
	public void call() {System.out.println("Phone is calling: ");}
	public void sms() {System.out.println("Phone recived message");}
}

interface Icamera{
	void record();
	void click();
}

interface IMusicPlayer{
	void play();
	void stop();
}

class SmartPhone extends phone implements Icamera, IMusicPlayer {
	@Override
	public void call() {System.out.println("Video calling from My class");}
	@Override
	public void record() {System.out.println("Smartphone recording started: ");}
	@Override
	public void play() {System.out.println("Smart phone Music started");
		
		
	}
	@Override
	public void stop() { System.out.println("SmartPhone Music stop: ");
		
		
	}
	@Override
	public void click() {
		System.out.println("Smartphone click");
		
	}
}


public class Lect_143_DemoInteface {
	public static void main(String[] args) {
		
		phone sp=new SmartPhone();
		sp.call();
		sp.sms();
	
		Icamera is=new SmartPhone();
		is.click();
		is.record();
		
		IMusicPlayer ims=new SmartPhone();
		ims.play();
		ims.stop();
		
	}

}
