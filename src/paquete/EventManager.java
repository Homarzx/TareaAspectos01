package paquete;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
	Map<String, ArrayList<EventListener>> listeners = new HashMap<>();

    public EventManager(String operation) {
    	this.listeners.put(operation, new ArrayList<EventListener>());
    }
    
    public  void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public  void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public  void notify(String eventType, Color color) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, color);
        }
    }

}
