package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CarOwner {
	@Getter
	@Setter
	@Id
	private String carOwnerId;
	@Getter
	@Setter
	private String carOwnerName;
	@Getter
	@Setter
	@OneToOne
	private Car car;
}
