package ch.home.learn;

import ch.home.learn.interfaces.CaseInterface;

public class Case implements CaseInterface {

    private int noMotherboards;
    private Motherboard [] motherboards;

    public Case(int noMotherboards){

        this.noMotherboards = noMotherboards;
        motherboards = new Motherboard[noMotherboards];

        for(int i = 0; i < noMotherboards; i++){
            motherboards[i] = new Motherboard();
        }
    }

    public Case(Motherboard[] motherboards){

        this.motherboards = motherboards;
        noMotherboards = motherboards.length;
    }

    @Override
    public void setMotherboard(Motherboard motherboard, int motherboardIdx) {

        motherboards[motherboardIdx] = motherboard;
    }

    @Override
    public Motherboard getMotherboard(int motherboardIdx) {
        return motherboards[motherboardIdx];
    }
}
