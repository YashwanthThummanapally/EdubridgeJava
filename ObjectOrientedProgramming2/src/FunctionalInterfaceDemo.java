
public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		Printer printer = new EpsonPrinter();
		printer.print();
		printer.scan();
//		printer.threeDPrinting();
//		System.out.println(EpsonPrinter.threeDPrinting());
		Printer.threeDPrinting();
	}
}
