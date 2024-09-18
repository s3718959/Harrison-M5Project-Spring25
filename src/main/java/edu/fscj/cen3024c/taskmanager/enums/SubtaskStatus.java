package edu.fscj.cen3024c.taskmanager.enums;

public enum SubtaskStatus {
    TO_DO("To-Do"),
    IN_PROGRESS("In Progress"),
    DONE("Done");

    private final String displayName;

    SubtaskStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
