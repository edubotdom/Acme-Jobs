
package acme.features.anonymous.arellano_bulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.arellano_bulletin.Arellano_bulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/arellano_bulletin/")
public class AnonymousArellano_bulletinController extends AbstractController<Anonymous, Arellano_bulletin> {

	@Autowired
	private AnonymousArellano_bulletinListService	listService;

	@Autowired
	private AnonymousArellano_bulletinCreateService	createService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}
