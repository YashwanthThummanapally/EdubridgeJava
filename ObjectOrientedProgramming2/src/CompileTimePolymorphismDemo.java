
class Phone {
	public void voiceCall() {
		System.out.println("Voice call with phone");
	}
}

class SmartPhone extends Phone {
	public void videoCall() {
		System.out.println("Video call with smart phone");
	}
}

class Communication {
	public void call(Phone p) {
		p.voiceCall();
//		p.videoCall(); // CE
	}

	public void call(SmartPhone s) {
		s.videoCall();
	}
}

public class CompileTimePolymorphismDemo {

	public static void main(String[] args) {
		Communication c = new Communication();
		
		Phone nokia = new Phone();
		c.call(nokia);
		
		SmartPhone vivo = new SmartPhone();
		c.call(vivo);
		
		Phone jio = new SmartPhone(); 
		c.call(jio); // Compile-time polymorphism
	}
}
