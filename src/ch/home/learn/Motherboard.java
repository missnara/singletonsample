package ch.home.learn;

import ch.home.learn.interfaces.Boardnterface;

public class Motherboard implements Boardnterface {

    private CPU singleCPU;


    public Motherboard(){

        singleCPU = CPU.getSingleCPU();
        //new motherboard rests the CPU's registers
        singleCPU.setRegister(0,0);
        singleCPU.setRegister(1,0);
        singleCPU.setRegister(2,0);
        singleCPU.setRegister(3,0);
    }
    @Override
    public CPU getProcessor() {
        return singleCPU;
    }
}
