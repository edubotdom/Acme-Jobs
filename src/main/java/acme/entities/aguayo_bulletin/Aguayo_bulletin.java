
package acme.entities.aguayo_bulletin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Aguayo_bulletin extends DomainEntity {

	/**
	 *
	 */
	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@Digits(fraction = 0, integer = 9999)
	@Positive
	private Integer				episodes;

	@NotBlank
	private String				director;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				aired;
}
