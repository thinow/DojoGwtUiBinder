package dojo.gwt.uibinder.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;

public interface StylesBundle extends ClientBundle {

	/**
	 * Style principal de l'application. L'annotation {@link NotStrict} permet
	 * d'importer l'ensemble du fichier CSS dans la page HTML.
	 */
	@NotStrict
	@Source("main.css")
	CssResource main();

}
