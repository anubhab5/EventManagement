package com.emc.managers;

import com.emc.dto.Event;

public class EventManagerImpl2 implements EventManager {

	@Override
	public Event create(long id) {
		return new Event(id, null, null);
	}

}
