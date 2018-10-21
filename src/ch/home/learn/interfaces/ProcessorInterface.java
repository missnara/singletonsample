package ch.home.learn.interfaces;

public interface ProcessorInterface {

    void add(int first, int second, int destination);
    void setRegister(int register, int value);
    int getRegister(int register);
}
