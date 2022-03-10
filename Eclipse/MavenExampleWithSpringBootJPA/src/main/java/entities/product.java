package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class product {
	@Getter
	@Setter
	@Id
	int productID;
	@Getter
	@Setter
	@Column(name="productCode")
	String code;
	@Getter
	@Setter
	@Column(name="productName")
	String name;
	@Getter
	@Setter
	@Column(name="productDesc")
	String desc;
	@Getter
	@Setter
	@Column(name="productPrice")
	double price;
}
