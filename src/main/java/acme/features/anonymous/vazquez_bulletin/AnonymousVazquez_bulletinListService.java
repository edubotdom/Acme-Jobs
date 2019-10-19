/*
 * AnonymousUserAccountCreateService.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.anonymous.vazquez_bulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.vazquez_bulletins.Vazquez_bulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousVazquez_bulletinListService implements AbstractListService<Anonymous, Vazquez_bulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousVazquez_bulletinRepository repository;


	@Override
	public boolean authorise(final Request<Vazquez_bulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Collection<Vazquez_bulletin> findMany(final Request<Vazquez_bulletin> request) {
		assert request != null;

		Collection<Vazquez_bulletin> result;

		result = this.repository.findMany();
		return result;
	}

	@Override
	public void unbind(final Request<Vazquez_bulletin> request, final Vazquez_bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "moment", "author", "tennis_player", "comment", "punctuation");
	}

}
