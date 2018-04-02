package com.springinaction.pizza.domain;

import com.springinaction.pizza.interfaces.Payment;

public class CashOrCheckPayment extends Payment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CashOrCheckPayment() {
	}

	public String toString() {
		return "CASH or CHECK:  $" + getAmount();
	}
}
