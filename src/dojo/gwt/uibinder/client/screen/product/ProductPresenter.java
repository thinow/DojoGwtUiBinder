package dojo.gwt.uibinder.client.screen.product;

import static com.google.gwt.i18n.client.NumberFormat.getFormat;

import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.ui.IsWidget;

import dojo.gwt.uibinder.client.model.Comment;
import dojo.gwt.uibinder.client.model.Product;
import dojo.gwt.uibinder.client.model.Rate;
import dojo.gwt.uibinder.client.model.factory.ProductFactory;

public class ProductPresenter {

	private static final NumberFormat RATE_FORMATTER = getFormat("0.0");

	private ProductView view = new ProductViewImpl();

	public ProductPresenter() {
		displayProduct(ProductFactory.aGreatOne());
	}

	private void displayProduct(Product product) {
		displayPictureOf(product);
		displayDetailsOf(product);
		displayCommentsOf(product);
	}

	private void displayPictureOf(Product product) {
		view.displayPicture(product.getPicture());
	}

	private void displayDetailsOf(Product product) {
		view.getNameField().setValue(product.getName());
		view.getRateField().setValue(stringOf(product.getRate()));
		view.getDescriptionField().setValue(product.getDescription());
		view.getColorField().setValue(product.getAlcohol());
		view.getBreweryField().setValue(product.getBrewery());
		view.getTypeField().setValue(product.getType());
		view.getAlcoholField().setValue(product.getAlcohol());
	}

	private void displayCommentsOf(Product product) {
		for (Comment comment : product.getComments()) {
			display(comment);
		}
	}

	private void display(Comment comment) {
		String authorName = comment.getAuthorName();
		String text = comment.getText();
		String rate = stringOf(comment.getRate());

		view.addComment(authorName, text, rate);
	}

	private String stringOf(Rate rate) {
		return RATE_FORMATTER.format(rate.getValue());
	}

	public IsWidget getView() {
		return view;
	}

}
