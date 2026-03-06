package com.capgemini.eventAnnouncementSystem.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.eventAnnouncementSystem.entity.Event;
import com.capgemini.eventAnnouncementSystem.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public List<Event> getAllEvents() {
        return repository.findAll();
    }

    public Event getEventById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Event createEvent(Event event) {
        return repository.save(event);
    }

    public Event updateEvent(Long id, Event event) {
        event.setId(id);
        return repository.save(event);
    }

    public void deleteEvent(Long id) {
        repository.deleteById(id);
    }

    public List<Event> findByType(String type) {
        return repository.findByEventType(type);
    }

    public List<Event> searchByTitle(String title) {
        return repository.findByTitleContaining(title);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}