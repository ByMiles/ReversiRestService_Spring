package game;

import server.RoundInfo;

public class Engine {

    private Rules rules;

    public void newGame(int x, int variation, int beginns){
        this.rules = new Rules(x, variation, beginns);
    }

    public void endRound(int row, int col){
        this.rules.endRound(row, col);
    }

    public void doAction(boolean skip, boolean undo)
    {
        if(skip)
            this.rules.skipRound();
        if(undo)
            this.rules.undoRound();
    }


    public RoundInfo newRound(){
        this.rules.newRound();
        return new RoundInfo(
                this.rules.getRound(),
                this.rules.getPossible(),
                this.rules.getPossibles(),
                this.rules.getIn_charge(),
                this.rules.getScore(),
                this.rules.getUndoable(),
                this.rules.checkWin()
                );
    }
}
