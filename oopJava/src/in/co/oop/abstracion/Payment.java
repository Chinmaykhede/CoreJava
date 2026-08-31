package in.co.oop.abstracion;

public class Payment extends Phonepe implements Service {

	@Override
	public void showPaymentDetails() {
		System.out.println("Payment ID  :" + paymentId);
		System.out.println("Amount  :" + amount);
		System.out.println("Payment Date  :" + paymentDate);
		System.out.println("Payment Method  :" + paymentMethod);
		System.out.println("Transaction ID  :" + transactionId);
	}

	@Override
	public void makePayment() {
		System.out.println("Payment Successfully");

	}

	@Override
	public void checkTransaction() {
		System.out.println("Transaction ID  :" + transactionId);
		System.out.println("Transaction Status  : Successful");

	}

}
