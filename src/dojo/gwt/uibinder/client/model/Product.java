package dojo.gwt.uibinder.client.model;

import java.util.Collection;

import com.google.gwt.resources.client.ImageResource;

public class Product {

	private String name;
	private ImageResource picture;
	private Rate rate;
	private String description;
	private String alcohol;
	private String brewery;
	private String type;
	private String color;

	private Collection<Comment> comments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ImageResource getPicture() {
		return picture;
	}

	public void setPicture(ImageResource picture) {
		this.picture = picture;
	}

	public Rate getRate() {
		return rate;
	}

	public void setRate(Rate rate) {
		this.rate = rate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public String getBrewery() {
		return brewery;
	}

	public void setBrewery(String brewery) {
		this.brewery = brewery;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

}
