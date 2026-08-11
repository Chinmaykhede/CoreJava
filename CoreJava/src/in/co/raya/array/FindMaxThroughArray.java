package in.co.raya.array;

public class FindMaxThroughArray {
	public static void main(String[] args) {
		int[] arr = { 10, 23, 34, 45, 6, 46, 9, 56, 89 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max No =" + max);
	}

}
