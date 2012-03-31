package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.NumberLabel;
import com.google.gwt.user.client.ui.TextBox;

public class ProductViewImpl extends FlowPanel implements ProductView {

	private static final HasText INVISIBLE_TEXT_FIELD = new TextBox();
	private static final TakesValue<Number> INVISIBLE_NUMBER_FIELD = new NumberLabel<Number>();

	@Override
	public void displayPicture(ImageResource picture) {

	}

	@Override
	public HasText getAlcoholField() {
		return INVISIBLE_TEXT_FIELD;
	}

	@Override
	public HasText getBreweryField() {
		return INVISIBLE_TEXT_FIELD;
	}

	@Override
	public HasText getColorField() {
		return INVISIBLE_TEXT_FIELD;
	}

	@Override
	public HasText getDescriptionField() {
		return INVISIBLE_TEXT_FIELD;
	}

	@Override
	public HasText getNameField() {
		return INVISIBLE_TEXT_FIELD;
	}

	@Override
	public TakesValue<Number> getRateField() {
		return INVISIBLE_NUMBER_FIELD;
	}

	@Override
	public HasText getTypeField() {
		return INVISIBLE_TEXT_FIELD;
	}

	@Override
	public void addComment(String authorName, String text, double rate) {
		// TODO Auto-generated method stub

	}

}
