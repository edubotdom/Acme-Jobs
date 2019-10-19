
package acme.features.anonymous.aguayo_bulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.aguayo_bulletin.Aguayo_bulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousAguayo_bulletinListService implements AbstractListService<Anonymous, Aguayo_bulletin> {

	@Autowired
	AnonymousAguayo_bulletinRepository repository;


	@Override
	public boolean authorise(final Request<Aguayo_bulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Aguayo_bulletin> request, final Aguayo_bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "title", "episodes", "aired", "director");

	}

	@Override
	public Collection<Aguayo_bulletin> findMany(final Request<Aguayo_bulletin> request) {
		assert request != null;
		Collection<Aguayo_bulletin> result;
		result = this.repository.findMany();
		return result;
	}
}
