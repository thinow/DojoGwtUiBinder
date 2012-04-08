package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

import dojo.gwt.uibinder.client.screen.product.comment.Comment;
import dojo.gwt.uibinder.client.screen.product.rate.RateLine;

public class ProductViewImpl extends Composite implements ProductView {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, ProductViewImpl> {
	}

	@UiField
	Image picture;
	@UiField
	Label name;
	@UiField
	RateLine rateLine;
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
		return rateLine.getRate();
	}

	@Override
	public HasText getTypeField() {
		return type;
	}

	@Override
	public void addComment(String authorName, String text, double rate) {
		commentsPanel.add(commentWith(authorName, text, rate));
	}

	private Comment commentWith(String authorName, String text, double rate) {
		Comment comment = new Comment();

		comment.getAuthorName().setText(authorName);
		comment.getRate().setValue(rate);
		comment.getText().setText(text);

		return comment;
	}

	@UiHandler("addComment")
	void onAddCommentClick(ClickEvent event) {
		// TODO
	}

}
