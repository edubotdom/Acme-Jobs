
package acme.entities.vazquez_bulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Range;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vazquez_bulletin extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

	@NotBlank
	private String				author;

	@NotBlank
	private String				tennis_player;

	@NotBlank
	private String				comment;

	@Range(min = 1, max = 10, message = "La puntuacion debe estar entre 1 y 10")
	private Double				punctuation;
}
