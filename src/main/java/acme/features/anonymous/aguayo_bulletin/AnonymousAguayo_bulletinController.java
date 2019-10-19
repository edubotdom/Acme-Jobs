
package acme.features.anonymous.aguayo_bulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.aguayo_bulletin.Aguayo_bulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/aguayo_bulletin")
public class AnonymousAguayo_bulletinController extends AbstractController<Anonymous, Aguayo_bulletin> {

	@Autowired
	private AnonymousAguayo_bulletinListService		listService;

	@Autowired
	private AnonymousAguayo_bulletinCreateService	createService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}
