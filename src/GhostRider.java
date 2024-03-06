public class GhostRider {
    Command command;
    public GhostRider(Command command){
        this.command = command;
    }
    public void revertAction(){
        command.revert();
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void takeAction(Command command){
        command.execute();
    }
}
