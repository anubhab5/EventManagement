package com.emc.managers;

import com.emc.dto.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(long id) {
		return new Event(id, "Marriage", "Ajay and Sakshi marriage");
	}

}
