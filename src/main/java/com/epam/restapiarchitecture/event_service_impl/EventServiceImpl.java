package com.epam.restapiarchitecture.event_service_impl;

import com.epam.restapiarchitecture.event_service_api.EventService;
import com.epam.restapiarchitecture.event_service_dto.EventDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

	private final EventRepository repository;

	public EventServiceImpl(EventRepository repository) {
		this.repository = repository;
	}

	@Override
	public EventDto createEvent(EventDto eventDto) {
		return repository.save(EventEntity.fromDto(eventDto)).toDto();
	}

	@Override
	public EventDto updateEvent(EventDto eventDto) {
		return repository.save(EventEntity.fromDto(eventDto)).toDto();
	}

	@Override
	public EventDto getEvent(Long id) {
		Optional<EventEntity> eventEntityOptional = repository.findById(id);
		return eventEntityOptional.map(EventEntity::toDto).orElse(null);
	}

	@Override
	public void deleteEvent(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<EventDto> getAllEvents() {
		List<EventEntity> eventEntities = repository.findAll();
		List<EventDto> eventDtos = new ArrayList<>();
		eventEntities.forEach(eventEntity -> eventDtos.add(eventEntity.toDto()));
		return eventDtos;
	}

	@Override
	public List<EventDto> getAllEventsByTitle(String title) {
		List<EventEntity> eventEntities = repository.findByTitleEquals(title);
		List<EventDto> eventDtos = new ArrayList<>();
		eventEntities.forEach(eventEntity -> eventDtos.add(eventEntity.toDto()));
		return eventDtos;
	}
}
