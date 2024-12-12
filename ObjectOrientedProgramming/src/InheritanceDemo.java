
public class InheritanceDemo {
	public static void main(String[] args) {
		Phone nokia = new Phone();
		nokia.call();
		nokia.message();
		nokia.playGames();
		nokia.recordVideo();

		System.out.println("------------");

		SmartPhone vivo = new SmartPhone();
		vivo.call();
		vivo.message();
		vivo.playGames();
		vivo.recordVideo();
		vivo.browse();
		vivo.accessApps();
	}
}
