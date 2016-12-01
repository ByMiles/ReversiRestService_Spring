package server;


public class RoundAction{

    private boolean skipable;
    private boolean undoable;

    public void setSkipable(boolean skipable) {
        this.skipable = skipable;
    }

    public void setUndoable(boolean undoable) {
        this.undoable = undoable;
    }

    public boolean getSkipable() {
        return skipable;
    }

    public boolean getUndoable() {
        return undoable;
    }




}
