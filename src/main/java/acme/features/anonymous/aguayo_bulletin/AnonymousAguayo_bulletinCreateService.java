
package acme.features.anonymous.aguayo_bulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.aguayo_bulletin.Aguayo_bulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousAguayo_bulletinCreateService implements AbstractCreateService<Anonymous, Aguayo_bulletin> {

	@Autowired
	AnonymousAguayo_bulletinRepository repository;


	@Override
	public boolean authorise(final Request<Aguayo_bulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<Aguayo_bulletin> request, final Aguayo_bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Aguayo_bulletin> request, final Aguayo_bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "episodes", "aired", "director");

	}

	@SuppressWarnings("deprecation")
	@Override
	public Aguayo_bulletin instantiate(final Request<Aguayo_bulletin> request) {
		assert request != null;
		Aguayo_bulletin result;
		Date aired;

		int year = 2019, month = 1, day = 7;
		aired = new Date(year - 1900, month - 1, day);

		result = new Aguayo_bulletin();
		result.setTitle("Mob Psycho 100 II");
		result.setEpisodes(11);
		result.setAired(aired);
		result.setDirector("Pepe García");

		return result;
	}

	@Override
	public void validate(final Request<Aguayo_bulletin> request, final Aguayo_bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Aguayo_bulletin> request, final Aguayo_bulletin entity) {
		// TODO Auto-generated method stub
		assert request != null;
		assert entity != null;

		//Date aired;
		//aired = new Date(System.currentTimeMillis() - 1);
		//entity.setAired(aired);
		this.repository.save(entity);
	}

}
