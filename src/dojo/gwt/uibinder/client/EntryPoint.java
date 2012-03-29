package dojo.gwt.uibinder.client;

import com.google.gwt.user.client.ui.RootPanel;

import dojo.gwt.uibinder.client.screen.product.ProductPresenter;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

	private static final String ROOT_PANEL_IDENTIFIER = "rootPanel";

	private ProductPresenter uniqueScreen = new ProductPresenter();

	@Override
	public void onModuleLoad() {
		rootPanel().add(uniqueScreen.getView());
	}

	private RootPanel rootPanel() {
		return RootPanel.get(ROOT_PANEL_IDENTIFIER);
	}

}
