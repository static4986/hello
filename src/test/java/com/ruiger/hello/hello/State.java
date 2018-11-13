package com.ruiger.hello.hello;

import java.beans.PropertyChangeSupport;

public class State {
    public State(String name) {
        this.name = name;
    }

    public static final int NOTRUN   = 0;
    public static final int FINISHED = 1;

    private final PropertyChangeSupport changes =
            new PropertyChangeSupport( this );

    private String name;
    private int    state;

    public PropertyChangeSupport getChanges() {
        return changes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
