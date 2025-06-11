package General;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

enum EventType {
	
	CLICK,HOVER,FOCUS
}

class EventSystem {
	
	private final Map<EventType, Consumer<String>> eventHandlers = new HashMap<>();
	
	public void registerredEvent(EventType eventType, Consumer<String> handler) {
		eventHandlers.put(eventType, handler);
	}
	
	public void trigerredEvent (EventType eventType, String eventData) {
		if(eventHandlers.containsKey(eventType)) {
			eventHandlers.get(eventType).accept(eventData);
		}
	}
}
public class LambdaEventHandling {
	
	public static void main(String[] args) {
		
		EventSystem eventSystem = new EventSystem();
		
		eventSystem.registerredEvent(EventType.CLICK,data -> System.out.println("Click event trigerred : "+ data));
		eventSystem.registerredEvent(EventType.HOVER,data -> System.out.println("Hover event trigerred : "+data));
		eventSystem.registerredEvent(EventType.FOCUS, data -> System.out.println("Focus event trigerred : " + data));
		
		eventSystem.trigerredEvent(EventType.CLICK,"Button clicked");
		eventSystem.trigerredEvent(EventType.HOVER,"Mouse Hovered on image");
		eventSystem.trigerredEvent(EventType.FOCUS,"Text field focussed");
	}
	


}
