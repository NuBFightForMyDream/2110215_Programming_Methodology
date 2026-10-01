package logic.components;

import exception.BadStatusException;

public class Status {
    // fields
    private int hp ;
    private int durability ;
    private int attack ;
    private int magic ;

    // constructors
    public Status(int hp , int durability , int attack , int magic) throws BadStatusException {
        // initiate value with setter methods
        setHp(hp);
        setDurability(durability);
        setAttack(attack) ;
        setMagic(magic);
    }

    // Getter - Setter methods
    public int getHp() throws BadStatusException {
        return hp;
    }

    public void setHp(int hp) throws BadStatusException {
        if (hp < 0) {
            throw new BadStatusException();
        }
        else this.hp = hp ;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) throws BadStatusException {
        if (durability < 0) {
            throw new BadStatusException();
        }
        else this.durability = durability ;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) throws BadStatusException {
        if (attack < 0) {
            throw new BadStatusException();
        }
        else this.attack = attack ;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) throws BadStatusException {
        if (magic < 0) {
            throw new BadStatusException();
        }
        else this.magic = magic ;
    }

    // another methods
    public void addStatus(Status another) throws BadStatusException {
        // set Hp , Durability , Attack , Magic to new value
        setHp( getHp() + another.getHp() );
        setDurability( getDurability() + another.getDurability() );
        setAttack( getAttack() + another.getAttack() );
        setMagic( getMagic() + another.getMagic() );
    }
}
