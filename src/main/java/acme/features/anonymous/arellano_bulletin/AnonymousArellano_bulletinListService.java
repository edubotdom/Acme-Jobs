
package acme.features.anonymous.arellano_bulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.arellano_bulletin.Arellano_bulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousArellano_bulletinListService implements AbstractListService<Anonymous, Arellano_bulletin> {

	@Autowired
	AnonymousArellano_bulletinRepository repository;


	@Override
	public boolean authorise(final Request<Arellano_bulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Arellano_bulletin> request, final Arellano_bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "pc", "moment");
	}

	@Override
	public Collection<Arellano_bulletin> findMany(final Request<Arellano_bulletin> request) {
		assert request != null;
		Collection<Arellano_bulletin> result;
		result = this.repository.findMany();
		return result;
	}

}
