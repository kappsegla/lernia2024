package se.lernia.java.records;

//Todo: Implement an event log
// - A method can be called to store an event that happened, use a record for representing an event.
// - Each event should store type of event, who/what triggered the even and a timestamp
// - Use the generic ArrayList<Event> for storing the events
// - Event types?
// - Who? Id? Name?
// - TimeStamp milliseconds since EPOCH? LocalDateTime?

//Todo: Implement a method or methods that can find and return all events from a specified time.
// - Specific day or hour
// - Intervall that could be from 8.00 a day to 12.00 for example.
// - What should we return when not finding any events?
// - What should happen if we specify start time that is after endtime?

//Todo: Implement a method that can visually present the events depending on the type of event
// - We want to use switch to check for different event types.
// - What type should event type be?


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class EventLog {

    static ArrayList<Event> events = new ArrayList<>();

    public static void main(String[] args) {
        storeEvent("Error", "1234");
        storeEvent("Warning", "1234");
        storeEvent("Break", "999");

        events.forEach(System.out::println);
    }

    private static void storeEvent(String type, String id) {
        Event e = new Event(new EventType(type), new EventTrigger(id), LocalDateTime.now());
        events.add(e);
    }

}

record Event(EventType type, EventTrigger trigger, LocalDateTime time) {
}

record EventType(String name) {
}

record EventTrigger(String triggerId) {
}

//final class NotFullyImmutable {
//    private final ArrayList<String> strings;
//
//    NotFullyImmutable(ArrayList<String> strings) {
//        this.strings = new ArrayList<>(strings);
//    }
//
//    public List<String> strings() {
//        return Collections.unmodifiableList(strings);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) return true;
//        if (obj == null || obj.getClass() != this.getClass()) return false;
//        var that = (NotFullyImmutable) obj;
//        return Objects.equals(this.strings, that.strings);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(strings);
//    }
//
//    @Override
//    public String toString() {
//        return "NotFullyImmutable[" +
//               "strings=" + strings + ']';
//    }
//
//
//}
