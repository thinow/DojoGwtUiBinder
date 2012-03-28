package dojo.gwt.uibinder.client;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

	private static final String ROOT_PANEL_IDENTIFIER = "rootPanel";

	@Override
	public void onModuleLoad() {
		rootPanel().add(new Label("Another... Hello World!"));
	}

	private RootPanel rootPanel() {
		return RootPanel.get(ROOT_PANEL_IDENTIFIER);
	}

}
