package logic.ghost;

import utils.Config;

//TODO implements here
public abstract class LowGhost extends Ghost {
    // should never be instantiated
    // act like base of other types of LowGhosts

    // constructors
    public LowGhost() {
        super(Config.LowGhostHp) ;
    }

    // methods
    @Override
    public int getLevel() {
        return Config.LowGhostLevel ;
    }


}
