package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.user.client.ui.IsWidget;

public class ProductPresenter {

	private ProductView view = new ProductViewImpl();

	public IsWidget getView() {
		return view;
	}

}
