
package acme.features.anonymous.arellano_bulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.arellano_bulletin.Arellano_bulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousArellano_bulletinRepository extends AbstractRepository {

	@Query("select s from Arellano_bulletin s")
	Collection<Arellano_bulletin> findMany();
}
