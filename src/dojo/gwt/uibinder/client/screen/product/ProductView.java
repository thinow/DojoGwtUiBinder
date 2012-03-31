package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;

public interface ProductView extends IsWidget {

	static final double MAX_RATE = 10.0;

	void displayPicture(ImageResource picture);

	HasText getAlcoholField();

	HasText getBreweryField();

	HasText getColorField();

	HasText getDescriptionField();

	HasText getNameField();

	TakesValue<Number> getRateField();

	HasText getTypeField();

	void addComment(String authorName, String text, double rate);

}
