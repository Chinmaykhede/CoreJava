package in.co.oop.exception;

public class TestLoginException {
	public static void main(String[] args) {
		String login = "login12@gmail.com";
		if (login == "login@gmail.com") {
			System.out.println("User Found");
		} else {
			try {
				throw new LoginExcepiton();
			} catch (LoginExcepiton e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
