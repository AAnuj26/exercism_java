class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

}

// TODO: define the Wizard class

class Wizard extends Fighter {
    private boolean spellPrepared = false;

    void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (spellPrepared) {
            return 12;
        } else {
            return 3;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}