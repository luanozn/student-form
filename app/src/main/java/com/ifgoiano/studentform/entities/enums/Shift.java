package com.ifgoiano.studentform.entities.enums;

public enum Shift {

    MORNING("Matutino"),
    AFTERNOON("Vespertino"),
    EVENING_NIGHT("Noturno"),
    FULL_TIME("Integral");

    private final String message;

    Shift(String shift) {
        this.message = shift;
    }

    public String getMessage() {
        return message;
    }
}
