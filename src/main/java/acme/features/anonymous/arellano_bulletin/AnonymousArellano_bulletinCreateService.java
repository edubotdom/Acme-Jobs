
package acme.features.anonymous.arellano_bulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.arellano_bulletins.Arellano_bulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousArellano_bulletinCreateService implements AbstractCreateService<Anonymous, Arellano_bulletin> {

	@Autowired
	AnonymousArellano_bulletinRepository repository;


	@Override
	public boolean authorise(final Request<Arellano_bulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<Arellano_bulletin> request, final Arellano_bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
		request.bind(entity, errors);

	}

	@Override
	public void unbind(final Request<Arellano_bulletin> request, final Arellano_bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "pc");
	}

	@Override
	public Arellano_bulletin instantiate(final Request<Arellano_bulletin> request) {
		assert request != null;
		Arellano_bulletin result;

		Date moment;
		moment = new Date(System.currentTimeMillis() - 1);

		result = new Arellano_bulletin();
		result.setPc("i7 9700K 16GB GTX 1660TI");
		result.setMoment(moment);
		return result;
	}

	@Override
	public void validate(final Request<Arellano_bulletin> request, final Arellano_bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Arellano_bulletin> request, final Arellano_bulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;
		moment = new Date(System.currentTimeMillis() - 1);

		entity.setMoment(moment);
		this.repository.save(entity);

	}

}
