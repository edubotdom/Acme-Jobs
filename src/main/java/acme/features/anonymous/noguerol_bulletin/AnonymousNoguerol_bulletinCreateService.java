
package acme.features.anonymous.noguerol_bulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.noguerol_bulletins.Noguerol_bulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousNoguerol_bulletinCreateService implements AbstractCreateService<Anonymous, Noguerol_bulletin> {

	//Internal state
	@Autowired
	AnonymousNoguerol_bulletinRepository repository;


	@Override
	public boolean authorise(final Request<Noguerol_bulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Noguerol_bulletin instantiate(final Request<Noguerol_bulletin> request) {
		assert request != null;

		Noguerol_bulletin result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		result = new Noguerol_bulletin();
		result.setName("Jhon Doe");
		result.setAmount(1.20);
		result.setMoment(moment);

		return result;
	}

	@Override
	public void unbind(final Request<Noguerol_bulletin> request, final Noguerol_bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "amount");
	}

	@Override
	public void bind(final Request<Noguerol_bulletin> request, final Noguerol_bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<Noguerol_bulletin> request, final Noguerol_bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Noguerol_bulletin> request, final Noguerol_bulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);
		this.repository.save(entity);
	}

}
