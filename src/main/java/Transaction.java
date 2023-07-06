
public class Transaction {
	Long transactionId;
	Long accountId;
	String transactionType;
	Double transactionAmount;
	
	
	public Transaction() {
		
	}
	
	public Transaction(Long accountId, String transactionType, Double transactionAmount) {
		super();
		this.accountId = accountId;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountId=" + accountId + ", transactionType="
				+ transactionType + ", transactionAmount=" + transactionAmount + "]";
	}
	
	

}
