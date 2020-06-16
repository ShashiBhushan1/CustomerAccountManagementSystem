package com.citi.model;
import lombok.Data;


/**
 * Account pojo java class is having @Data is a convenient shortcut annotation that bundles the features of 
 * @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
 */


@Data
public class Account {
	private String accountId;
	private String accountNo;
	private String accountType;
	private String amount;
	private Long custNo;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Long getCustNo() {
		return custNo;
	}
	public void setCustNo(Long custNo) {
		this.custNo = custNo;
	}

}
