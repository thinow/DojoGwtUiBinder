package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.NumberLabel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class ProductViewImpl extends Composite implements ProductView {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, ProductViewImpl> {
	}

	@UiField
	Image picture;
	@UiField
	Label name;
	@UiField
	NumberLabel<Number> rate;
	@UiField
	NumberLabel<Number> maxRate;
	@UiField
	Label description;
	@UiField
	Label color;
	@UiField
	Label alcohol;
	@UiField
	Label type;
	@UiField
	Label brewery;

	@UiField
	Panel commentsPanel;

	public ProductViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));

		maxRate.setValue(MAX_RATE);
	}

	@Override
	public void displayPicture(ImageResource resource) {
		picture.setResource(resource);
	}

	@Override
	public HasText getAlcoholField() {
		return alcohol;
	}

	@Override
	public HasText getBreweryField() {
		return brewery;
	}

	@Override
	public HasText getColorField() {
		return color;
	}

	@Override
	public HasText getDescriptionField() {
		return description;
	}

	@Override
	public HasText getNameField() {
		return name;
	}

	@Override
	public TakesValue<Number> getRateField() {
		return rate;
	}

	@Override
	public HasText getTypeField() {
		return type;
	}

	@Override
	public void addComment(String authorName, String text, double rate) {
		// TODO Auto-generated method stub

	}

}
