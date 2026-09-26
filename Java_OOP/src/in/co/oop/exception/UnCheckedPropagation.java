package in.co.oop.exception;

public class UnCheckedPropagation {
	public static void main(String[] args) {
		dod();

	}

	public static void dod() {
		mom();

	}

	private static void mom() {
		son();

	}

	private static void son() {
		throw new RuntimeException("");

	}

}
