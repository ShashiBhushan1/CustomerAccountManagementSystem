package com.citi.dto;
import lombok.Data;


/**
 * AccountDTO dto java class is having @Data is a convenient shortcut annotation that bundles the features of 
 * @ToString, @EqualsAndHashCode, @Getter / @Setter.
 */

@Data
public class AccountDTO {
	private String accountId;
	private String accountNo;
	private String accountType;
	private String amount;
	private Long custNo;

}
