package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;

import dojo.gwt.uibinder.client.model.Rate;

public interface ProductView extends IsWidget {

	static final Rate MAX_RATE = new Rate(10.0);

	void displayPicture(ImageResource picture);

	HasText getAlcoholField();

	HasText getBreweryField();

	HasText getColorField();

	HasText getDescriptionField();

	HasText getNameField();

	HasText getRateField();

	HasText getTypeField();

	void addComment(String authorName, String text, String rate);

}
