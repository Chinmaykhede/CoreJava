package in.co.oop.exception;

public class CheckedPropagation {
	public static void main(String[] args) {
		try {
			dad();
		} catch (Exception e) {
			System.out.println("I handle ....." + e.getMessage());
		}
	}

	private static void dad() throws Exception {
		mom();
	}

	private static void mom() throws Exception {
		son();

	}

	private static void son() throws Exception {
		throw new Exception("Make a mistake");

	}

}
