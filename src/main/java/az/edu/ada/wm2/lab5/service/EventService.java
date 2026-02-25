package az.edu.ada.wm2.lab5.service;

import az.edu.ada.wm2.lab5.model.Event;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface EventService {
    Event createEvent(Event event);

    Event getEventById(UUID id);

    List<Event> getAllEvents();

    Event updateEvent(UUID id, Event event);

    void deleteEvent(UUID id);

    Event partialUpdateEvent(UUID id, Event partialEvent);

    // Custom methods
    List<Event> getEventsByTag(String tag);

    List<Event> getUpcomingEvents();

    List<Event> getEventsByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);

    List<Event> getEventsByDateRange(LocalDateTime start, LocalDateTime end);

    Event updateEventPrice(UUID id, BigDecimal newPrice);
}