package org.egitim.entity;

import org.springframework.stereotype.Component;

@Component
public class TvShow extends MovieDetail {

	private short season;
	private short episode;

	public short getSeason() {
		return season;
	}

	public void setSeason(short season) {
		this.season = season;
	}

	public short getEpisode() {
		return episode;
	}

	public void setEpisode(short episode) {
		this.episode = episode;
	}

}
