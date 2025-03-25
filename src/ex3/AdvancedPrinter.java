package ex3;

class AdvancedPrinter implements Printable,Sendable {
	@Override
	public void printDocument() {
		System.out.println("The advanced printer prints a document.");
	}

	@Override
	public void sendFax() {
		System.out.println("The advanced printer sends a fax.");
	}
}
