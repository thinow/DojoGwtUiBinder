package dojo.gwt.uibinder.client.model.factory;

import java.util.ArrayList;
import java.util.Collection;

import com.google.gwt.core.client.GWT;

import dojo.gwt.uibinder.client.model.Comment;
import dojo.gwt.uibinder.client.model.Product;
import dojo.gwt.uibinder.client.model.Rate;
import dojo.gwt.uibinder.client.resources.ProductPicture;

public final class ProductFactory {

	private static Product product;
	private static Collection<Comment> comments;

	private static ProductPicture pictures = GWT.create(ProductPicture.class);

	private ProductFactory() {
	}

	public static Product aGreatOne() {
		initializeProduct();
		defineProductDetails();
		defineProductComments();

		return product;
	}

	private static void initializeProduct() {
		product = new Product();
	}

	private static void defineProductDetails() {
		product.setName("Gouden Carolus");
		product.setPicture(pictures.goudenCarolusPicture());
		product.setRate(rateOf(9.5));
		product.setColor("blonde");
		product.setBrewery("Het Anker");
		product.setType("maltage triple");
		product.setAlcohol("9%");
		product.setDescription("La Gouden Carolus triple est une bière Belge"
				+ " issue de la Gamme Gouden Carolus qui vous est proposée par"
				+ " l'excellente Brasserie Het Anker.\nLes bières Gouden"
				+ " Carolus bénéficie donc d'un savoir faire bien plus que"
				+ " centenaire puisque cette Brasserie Belge fut fondée en"
				+ " 1369 !\n\nLa Gouden Carolus Triple est une bière à la"
				+ " robe blonde dorée et limpide qui se pare d'une mousse aérée"
				+ " et relativement abondante. Ce col de mousse laisse passer"
				+ " jusqu'au nez des arômes maltés et épicés qui évoque aussi"
				+ " bien le caramel que l'anis avec des soupçons de fruits.");
	}

	private static void defineProductComments() {
		initializeComments();
		injectSomeComments();
	}

	private static void initializeComments() {
		comments = new ArrayList<Comment>();
		product.setComments(comments);
	}

	private static void injectSomeComments() {
		comments.add(commentWith("Chewie", 10.0, "Grrrrwoooahll! Nwawgn"
				+ " nwagn!"));
		comments.add(commentWith("Perceval", 9.0, "On en a gros!"));
		comments.add(commentWith("Luke S.", 9.5, "Vous n'auriez pas vu mon"
				+ " père ?"));
	}

	private static Comment commentWith(String author, double rate, String text) {
		Comment comment = new Comment();
		comment.setAuthorName(author);
		comment.setRate(rateOf(rate));
		comment.setText(text);

		return comment;
	}

	private static Rate rateOf(double value) {
		return new Rate(value);
	}

}
