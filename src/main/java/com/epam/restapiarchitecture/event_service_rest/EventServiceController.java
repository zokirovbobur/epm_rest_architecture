package com.epam.restapiarchitecture.event_service_rest;

import com.epam.restapiarchitecture.event_service_api.EventService;
import com.epam.restapiarchitecture.event_service_dto.EventDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api")
@RestController
public class EventServiceController {
	private final EventService service;

	public EventServiceController(EventService service) {
		this.service = service;
	}

	@GetMapping
	public EventDto getEvent(@RequestParam Long id) {
		return service.getEvent(id);
	}

	@PostMapping
	public EventDto createEvent(EventDto eventDto) {
		return service.createEvent(eventDto);
	}

	@PutMapping
	public EventDto updateEvent(EventDto eventDto){
		return service.updateEvent(eventDto);
	}

	@GetMapping("all")
	public List<EventDto> eventDtoList(@RequestParam(required = false) String title){
		if (title == null) {
			return service.getAllEvents();
		}
		return service.getAllEventsByTitle(title);
	}

	@DeleteMapping
	public void deleteEvent(@RequestParam Long id) {
		service.deleteEvent(id);
	}
}
