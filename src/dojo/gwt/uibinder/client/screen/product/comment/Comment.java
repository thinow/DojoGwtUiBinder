package dojo.gwt.uibinder.client.screen.product.comment;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import dojo.gwt.uibinder.client.screen.product.rate.RateLine;

public class Comment extends Composite {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, Comment> {
	}

	@UiField
	Label authorName;
	@UiField
	RateLine rateLine;
	@UiField
	Label text;

	public Comment() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public HasText getAuthorName() {
		return authorName;
	}

	public TakesValue<Number> getRate() {
		return rateLine.getRate();
	}

	public HasText getText() {
		return text;
	}

}
