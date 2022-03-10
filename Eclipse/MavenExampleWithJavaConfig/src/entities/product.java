package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class product {
	@Getter
	@Setter
	long productID;
	@Getter
	@Setter
	String code;
	@Getter
	@Setter
	String name;
	@Getter
	@Setter
	String desc;
	@Getter
	@Setter
	double price;
}
