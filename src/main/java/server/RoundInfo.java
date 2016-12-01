package server;

/**
 * Created by Miles on 28.11.2016 for me.
 */
public class RoundInfo {

    private final boolean round[][][];
    private final boolean possible[][];
    private final boolean possibles [];
    private final boolean in_charge[];
    private final int score[];
    private final boolean undoable;
    private final int won;


    public RoundInfo(
            boolean round[][][],
            boolean possible[][],
            boolean possibles [],
            boolean in_charge[],
            int score[],
            boolean undoable,
            int won){

        this.round = round;
        this.possible = possible;
        this.possibles = possibles;
        this.in_charge = in_charge;
        this.score = score;
        this.undoable = undoable;
        this.won = won;
    }

    public boolean[] getPossibles() {
        return possibles;
    }

    public boolean[][] getPossible() {
        return possible;
    }

    public boolean[] getIn_charge() {
        return in_charge;
    }

    public boolean[][][] getRound(){
        return round;
    }

    public int[] getScore() {
        return score;
    }

    public boolean isUndoable() {
        return undoable;
    }

    public int getWon() {
        return won;
    }
}
