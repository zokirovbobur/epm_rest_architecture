package com.epam.restapiarchitecture.event_service_impl;

import com.epam.restapiarchitecture.event_service_dto.EventDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventEntity {
	@Id @GeneratedValue
	private Long id;
	private String title;
	private String place;
	private String speaker;
	private String eventType;
	private String dateTime;

	public EventDto toDto(){
		return new EventDto(id, title, place, speaker, eventType, dateTime);
	}

	public static EventEntity fromDto(EventDto eventDto){
		return new EventEntity(
				eventDto.getId(),
				eventDto.getTitle(),
				eventDto.getPlace(),
				eventDto.getSpeaker(),
				eventDto.getEventType(),
				eventDto.getDateTime()

		);
	}

	public EventEntity() {
	}

	public EventEntity(Long id, String title, String place, String speaker, String eventType, String dateTime) {
		this.id = id;
		this.title = title;
		this.place = place;
		this.speaker = speaker;
		this.eventType = eventType;
		this.dateTime = dateTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
}
