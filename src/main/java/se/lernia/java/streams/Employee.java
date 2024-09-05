package se.lernia.java.streams;

import java.util.List;

public record Employee(String id, String firstName, String lastName, int salary, int totalLaptopsAssigned,
                       List<Project> projects) {
    public String fullName() {
        return firstName() + " " + lastName();
    }
}
