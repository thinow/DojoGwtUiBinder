package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.user.client.ui.IsWidget;

import dojo.gwt.uibinder.client.model.Comment;
import dojo.gwt.uibinder.client.model.Product;
import dojo.gwt.uibinder.client.model.factory.ProductFactory;

public class ProductPresenter {

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
		view.getNameField().setText(product.getName());
		view.getRateField().setValue(product.getRate().getValue());
		view.getDescriptionField().setText(product.getDescription());
		view.getColorField().setText(product.getColor());
		view.getBreweryField().setText(product.getBrewery());
		view.getTypeField().setText(product.getType());
		view.getAlcoholField().setText(product.getAlcohol());
	}

	private void displayCommentsOf(Product product) {
		for (Comment comment : product.getComments()) {
			display(comment);
		}
	}

	private void display(Comment comment) {
		String authorName = comment.getAuthorName();
		String text = comment.getText();
		double rate = comment.getRate().getValue();

		view.addComment(authorName, text, rate);
	}

	public IsWidget getView() {
		return view;
	}

}
