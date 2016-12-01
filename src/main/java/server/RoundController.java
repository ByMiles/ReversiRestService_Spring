package server;

import game.Engine;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoundController {

    private Engine engine;

    @CrossOrigin(origins = "*")
    @PostMapping("/Reversi/start")
    public RoundInfo start(@RequestBody GameNew gameNew){
        engine = new Engine();
        this.engine.newGame(gameNew.getX(), gameNew.getVariation(), gameNew.getBeginner());
        return this.engine.newRound();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/Reversi/endRound")
    public RoundInfo endRound(@RequestBody RoundEnd roundEnd){
        this.engine.endRound(roundEnd.getRow(), roundEnd.getCol());
        return this.engine.newRound();
    }


    @CrossOrigin(origins = "*")
    @RequestMapping("/Reversi/action")
    public RoundInfo action(@RequestBody RoundAction roundAction){
        this.engine.doAction(roundAction.getSkipable(), roundAction.getUndoable());
        return this.engine.newRound();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/Reversi/newPvp")
    public RoundInfo newGame(@RequestBody GameNew gameNew){
        this.engine.newGame(gameNew.getX(), gameNew.getVariation(), gameNew.getBeginner());
        return this.engine.newRound();
    }
}
