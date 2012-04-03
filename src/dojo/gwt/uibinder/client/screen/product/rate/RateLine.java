package dojo.gwt.uibinder.client.screen.product.rate;

import static dojo.gwt.uibinder.client.screen.product.ProductView.MAX_RATE;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.NumberLabel;
import com.google.gwt.user.client.ui.Widget;

public class RateLine extends Composite {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, RateLine> {
	}

	@UiField
	NumberLabel<Number> rate;
	@UiField
	NumberLabel<Number> maxRate;

	public RateLine() {
		initWidget(uiBinder.createAndBindUi(this));

		maxRate.setValue(MAX_RATE);
	}

	public TakesValue<Number> getRate() {
		return rate;
	}

}
