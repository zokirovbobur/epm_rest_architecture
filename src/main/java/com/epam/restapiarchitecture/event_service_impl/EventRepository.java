package com.epam.restapiarchitecture.event_service_impl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
	List<EventEntity> findByTitleEquals(String title);
}
