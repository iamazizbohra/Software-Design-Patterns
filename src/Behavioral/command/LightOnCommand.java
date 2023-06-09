package Behavioral.command;

public class LightOnCommand implements Command{
    Light light;
    int level;

    LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
