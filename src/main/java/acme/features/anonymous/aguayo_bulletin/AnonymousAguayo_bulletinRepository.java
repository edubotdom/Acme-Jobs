
package acme.features.anonymous.aguayo_bulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.aguayo_bulletin.Aguayo_bulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousAguayo_bulletinRepository extends AbstractRepository {

	@Query("select a from Aguayo_bulletin a")
	Collection<Aguayo_bulletin> findMany();

}
