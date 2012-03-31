package dojo.gwt.uibinder.client.screen.product;

import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.NumberLabel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class ProductViewImpl extends FlowPanel implements ProductView {

	private static final String RATE_SEPARATOR = " / ";

	private static final String RATE_FORMAT = "0.#";

	private Label alcohol;
	private Label brewery;
	private Label color;
	private Label description;
	private Label name;
	private Image picture;
	private NumberLabel<Number> rate;
	private Label type;

	private Panel commentsPanel;

	private NumberFormat rateFormatter;

	public ProductViewImpl() {
		constructStructure();
	}

	private void constructStructure() {
		initializeFields();
		add(newFirstColumn());
		add(newSecondColumn());
	}

	private void initializeFields() {
		rateFormatter = NumberFormat.getFormat(RATE_FORMAT);

		alcohol = new Label();
		brewery = new Label();
		color = new Label();
		description = new Label();
		name = new Label();
		picture = new Image();
		rate = rateLabel();
		type = new Label();

		commentsPanel = new FlowPanel();
	}

	private Panel newFirstColumn() {
		Panel column = new FlowPanel();
		column.add(picture);

		return column;
	}

	private Panel newSecondColumn() {
		Panel column = new FlowPanel();
		column.add(name);
		column.add(newRateBlock());
		column.add(newDescriptionBlock());
		column.add(newDetailsBlock());
		column.add(newCommentsBlock());

		return column;
	}

	private Widget newRateBlock() {
		FlowPanel block = new FlowPanel();
		block.add(new Label("Note moyenne :"));
		block.add(newRateLineWith(rate));

		return block;
	}

	private Widget newDescriptionBlock() {
		return newCollapsibleBlockWith("Description", description);
	}

	private Widget newDetailsBlock() {
		FlowPanel group = new FlowPanel();
		group.add(newDetailLineWith("Couleur", color));
		group.add(newDetailLineWith("Degré d'alcool", alcohol));
		group.add(newDetailLineWith("Type", type));
		group.add(newDetailLineWith("Brasserie", brewery));

		return newCollapsibleBlockWith("Détails", group);
	}

	private Widget newDetailLineWith(String label, Widget field) {
		Panel line = new FlowPanel();
		line.add(new Label(label));
		line.add(field);

		return line;
	}

	private Widget newCommentsBlock() {
		return newCollapsibleBlockWith("Commentaires", commentsPanel);
	}

	private Widget newCollapsibleBlockWith(String header, Widget content) {
		DisclosurePanel block = new DisclosurePanel(header);
		block.setOpen(true);
		block.add(content);

		return block;
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
		commentsPanel.add(newCommentBlockWith(authorName, text, rate));
	}

	private Widget newCommentBlockWith(String authorName, String text,
			double rate) {

		FlowPanel block = new FlowPanel();
		block.add(new Label(authorName));
		block.add(newRateLineOf(rate));
		block.add(new Label(text));

		return block;
	}

	private Widget newRateLineOf(double value) {
		NumberLabel<Number> label = newLabelOfRate(value);
		return newRateLineWith(label);
	}

	private Widget newRateLineWith(NumberLabel<Number> label) {
		Panel line = new FlowPanel();
		line.add(label);
		line.add(new Label(RATE_SEPARATOR));
		line.add(newLabelOfRate(MAX_RATE));

		return line;
	}

	private NumberLabel<Number> newLabelOfRate(double value) {
		NumberLabel<Number> label = rateLabel();
		label.setValue(value);

		return label;
	}

	private NumberLabel<Number> rateLabel() {
		return new NumberLabel<Number>(rateFormatter);
	}

}
