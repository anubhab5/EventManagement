package com.emc.test;

import com.emc.dto.Event;
import com.emc.dto.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl;
import com.emc.managers.EventManagerImpl2;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.setId(23L);
		organizer.setName("Test org");

		System.out.println(organizer.getId());
		System.out.println(organizer.getName());

		Event ev = new Event(456l, "Some New Event", "Event Description");

		System.out.println(ev.getId());
		System.out.println(ev.getDescription());

		EventManager em = new EventManagerImpl2();
		System.out.println(em.create(23l).getId());;
		
	}

}
