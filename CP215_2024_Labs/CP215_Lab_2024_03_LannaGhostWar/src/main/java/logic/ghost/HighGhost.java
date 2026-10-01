package logic.ghost;

import utils.Config;

//TODO implements here
public abstract class HighGhost extends Ghost {
    // should never be instantiated
    // act as base of all high ghosts

    // constructors
    public HighGhost() {
        // set health with super
        super(Config.HighGhostHp);
    }

    public abstract void damage() ;
}