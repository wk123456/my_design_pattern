package com.company.command;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }

//    @Override
//    public void undo() {
//        light.lightOn();
//    }
}
