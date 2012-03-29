package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.IsWidget;

import dojo.gwt.uibinder.client.model.Rate;

public interface ProductView extends IsWidget {

	static final Rate MAX_RATE = new Rate(10.0);

	void displayPicture(ImageResource picture);

	HasValue<String> getAlcoholField();

	HasValue<String> getBreweryField();

	HasValue<String> getColorField();

	HasValue<String> getDescriptionField();

	HasValue<String> getNameField();

	HasValue<String> getRateField();

	HasValue<String> getTypeField();

	void addComment(String authorName, String text, String rate);

}
