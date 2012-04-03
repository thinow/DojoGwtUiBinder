package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class ProductViewImpl extends Composite implements ProductView {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, ProductViewImpl> {
	}

	public ProductViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void displayPicture(ImageResource picture) {
		// TODO Auto-generated method stub

	}

	@Override
	public HasText getAlcoholField() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HasText getBreweryField() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HasText getColorField() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HasText getDescriptionField() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HasText getNameField() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TakesValue<Number> getRateField() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HasText getTypeField() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addComment(String authorName, String text, double rate) {
		// TODO Auto-generated method stub

	}

}
