package com.moneymoneybank.collection;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit = 10000f;

	public CurrentAcc(int accNo, String accNm, int accBal, float creditLimit) {
		super(accNo, accNm, accBal);
	}

	@Override
	abstract public void withdraw(float amount);

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + getCreditLimit() + ", toString()=" + super.toString() + "]";
	}

	public float getCreditLimit() {
		return creditLimit;
	}

}
