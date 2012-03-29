package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class ProductViewImpl extends FlowPanel implements ProductView {

	public ProductViewImpl() {
		add(new Label("Voici mon seul et unique écran !"));
	}

}
