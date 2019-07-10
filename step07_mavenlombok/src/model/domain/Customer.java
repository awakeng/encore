package model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@ToString
public class Customer {
	private String name;
	@ToString.Exclude private int age;

}
