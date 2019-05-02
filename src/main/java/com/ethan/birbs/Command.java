package com.ethan.birbs;

public enum Command {

    ADD("add"), OBSERVATION("observation"),
    STATISTICS("statistics"), SHOW("show"),
    QUIT("quit"), UNKNOWN("unknown");

    String value;

    Command(String value) {
        this.value = value;
    }

    private String getValue() {
        return this.value;
    }

    public static Command parse(String value) {

        Command[] commands = Command.values();
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].value.equalsIgnoreCase(value)) {
                return commands[i];
            }
        }

        return UNKNOWN;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
