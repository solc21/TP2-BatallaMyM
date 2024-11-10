package com.myjavaproject.classes.equipamiento;

public class Varita {
    private boolean funcional;

    public Varita(boolean funcional) {
        this.funcional = funcional; // Default state of the wand
    }

    public boolean puedeUsarse() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }
}