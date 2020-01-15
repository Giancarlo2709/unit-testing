package com.platzi.javatest.payments;

public class PaymentResponse {

	public enum PaymentStatus {
		OK, ERROR;
	}

	private PaymentStatus status;

	public PaymentResponse(PaymentStatus status) {
		super();
		this.status = status;
	}

	public PaymentStatus getStatus() {
		return status;
	}

}
