package com.epam.restapiarchitecture.event_service_api;

import com.epam.restapiarchitecture.event_service_dto.EventDto;

import java.util.List;

public interface EventService {
	EventDto createEvent(EventDto eventDto);
	EventDto updateEvent(EventDto eventDto);
	EventDto getEvent(Long id);
	void deleteEvent(Long id);
	List<EventDto> getAllEvents();
	List<EventDto> getAllEventsByTitle(String title);
}
