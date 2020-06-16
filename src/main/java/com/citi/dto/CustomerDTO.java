package com.citi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * CustomerDTO pojo java class is having @Data is a convenient shortcut annotation that bundles the features of 
 * @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
 */

@AllArgsConstructor
@ToString(includeFieldNames = false)
@Data
public class CustomerDTO {
	private Long custId;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNo;
	private String ssnNo;
}
