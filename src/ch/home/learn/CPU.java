package ch.home.learn;

import ch.home.learn.interfaces.ProcessorInterface;

public class CPU implements ProcessorInterface{

    private static CPU singleCPU = new CPU();

    private int[] registers = {0,0,0,0};

    private CPU(){}

    @Override
    public void add(int first, int second, int destination) {
        registers[destination] = registers[first] + registers[second];
    }

    @Override
    public void setRegister(int register, int value) {
        registers[register] = value;
    }

    @Override
    public int getRegister(int register) {
        return registers[register];
    }

    public static CPU getSingleCPU() {
        return singleCPU;
    }

    @Override
    public String toString(){

        return "["+registers[0]+", "+registers[1]+", "+registers[2]+", "+registers[3]+"]";
    }
}
