package dojo.gwt.uibinder.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

import dojo.gwt.uibinder.client.resources.StylesBundle;
import dojo.gwt.uibinder.client.screen.product.ProductPresenter;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

	private static final String ROOT_PANEL_IDENTIFIER = "rootPanel";

	private StylesBundle styles = GWT.create(StylesBundle.class);

	private ProductPresenter uniqueScreen = new ProductPresenter();

	@Override
	public void onModuleLoad() {
		injectMainStylesheet();
		displayMainScreen();
	}

	private void injectMainStylesheet() {
		styles.main().ensureInjected();
	}

	private void displayMainScreen() {
		rootPanel().add(uniqueScreen.getView());
	}

	private RootPanel rootPanel() {
		return RootPanel.get(ROOT_PANEL_IDENTIFIER);
	}

}
