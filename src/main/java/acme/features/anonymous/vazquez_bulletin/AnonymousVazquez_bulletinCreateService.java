
package acme.features.anonymous.vazquez_bulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.vazquez_bulletins.Vazquez_bulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousVazquez_bulletinCreateService implements AbstractCreateService<Anonymous, Vazquez_bulletin> {

	//Internal state
	@Autowired
	AnonymousVazquez_bulletinRepository repository;


	@Override
	public boolean authorise(final Request<Vazquez_bulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Vazquez_bulletin instantiate(final Request<Vazquez_bulletin> request) {
		assert request != null;

		Vazquez_bulletin result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		result = new Vazquez_bulletin();
		result.setMoment(moment);
		result.setAuthor("Default author");
		result.setTennis_player("Default tennis player");
		result.setComment("Default comment");
		result.setPunctuation(null);

		return result;
	}

	@Override
	public void unbind(final Request<Vazquez_bulletin> request, final Vazquez_bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "moment", "author", "tennis_player", "comment", "punctuation");
	}

	@Override
	public void bind(final Request<Vazquez_bulletin> request, final Vazquez_bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<Vazquez_bulletin> request, final Vazquez_bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Vazquez_bulletin> request, final Vazquez_bulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);
		this.repository.save(entity);
	}

}
