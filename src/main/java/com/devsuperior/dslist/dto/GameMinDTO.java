package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {
	private Long id;
	private String title;
	private Integer gameYear;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		// TODO Auto-generated constructor stub
	}
	public GameMinDTO(Game entity) {

		id = entity.getId();
		title = entity.getTitle();
		gameYear = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	public GameMinDTO(GameMinProjection projection) {

		id = projection.getId();
		title = projection.getTitle();
		gameYear = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getGameYear() {
		return gameYear;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}


}


