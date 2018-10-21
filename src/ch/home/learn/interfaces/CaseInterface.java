package ch.home.learn.interfaces;

import ch.home.learn.Motherboard;

public interface CaseInterface {

    void setMotherboard(Motherboard motherboard, int motherboardIdx);

    Motherboard getMotherboard(int motherboardIdx);
}
