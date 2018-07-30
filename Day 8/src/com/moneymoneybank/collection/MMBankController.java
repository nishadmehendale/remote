package com.moneymoneybank.collection;

public class MMBankController extends BankController{
	private BankCollection bc;
	private BankFactory bf;
	public MMBankController(BankFactory bf) {
		super(bf);
		this.bf = bf;
		bc = new BankCollection();
	}
	@Override
	public void createNewSavingAccount(int accNo, String accNm, int accBal, boolean isSalaried) {
		BankAcc ba = bf.getNewSavingAcc(accNo, accNm, accBal, isSalaried);
		bc.addNewAccount(ba);
	}
	@Override
	public void createNewCurrentAccount(int accNo, String accNm, int accBal, float creditLimit) {
		BankAcc ba = bf.getNewCurrentAcc(accNo, accNm, accBal, creditLimit);
		bc.addNewAccount(ba);
	}
	@Override
	public String presentAccountToView(int accNo) {
		//al.stream(accNo).forEach(accNumber) -> System.out.println(BankAcc);
		String details = new String();
		for(BankAcc ba: bc.al) {
			if(ba.getAccNo() == accNo) {
				details = ba.toString();
			}
		}
		return details;
	}
	
	

	
}
