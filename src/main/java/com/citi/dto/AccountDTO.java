package com.citi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * AccountDTO dto java class is having @Data is a convenient shortcut annotation that bundles the features of 
 * @ToString, @EqualsAndHashCode, @Getter / @Setter.
 */
 
 
@AllArgsConstructor
@ToString(includeFieldNames = false)
@Data
public class AccountDTO {
	private String accountId;
	private String accountNo;
	private String accountType;
	private String amount;
	private Long custNo;

}
