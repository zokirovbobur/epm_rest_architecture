package com.epam.restapiarchitecture.event_service_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
	private Long id;
	private String title;
	private String place;
	private String speaker;
	private String eventType;
	private String dateTime;
}
