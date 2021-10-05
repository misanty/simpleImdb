package org.egitim.entity;

import java.time.LocalDate;
import java.util.EnumSet;

public abstract class Movie {
	private String title;
	private String description;
	private LocalDate releaseDate;
	private EnumSet<FilmCategory> category;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public EnumSet<FilmCategory> getCategory() {
		return category;
	}

	public void setCategory(EnumSet<FilmCategory> category) {
		this.category = category;
	}

}
