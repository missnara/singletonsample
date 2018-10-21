package ch.home.learn;

public class Main {

    public static void main(String[] args) {

        Case c1 = new Case(1);
        Case c2 = new Case(2);
        System.out.println("two Case objects c1, c2 are instantiated, CPU's register values are:");
        System.out.println(c1.getMotherboard(0).getProcessor());

        c1.getMotherboard(0).getProcessor().setRegister(2,100);
        c1.getMotherboard(0).getProcessor().setRegister(1,26);

        System.out.println("CPU's register values after modification on c1 through:");
        System.out.println("c1-->"+c1.getMotherboard(0).getProcessor());
        System.out.println("c2, first board-->"+c2.getMotherboard(0).getProcessor());
        System.out.println("c2, second board-->"+c2.getMotherboard(1).getProcessor());


        Case c3 = new Case(1);
        System.out.println("New case object c3 is instantiated, CPU's register values through c1:");
        System.out.println(c1.getMotherboard(0).getProcessor());
    }
}
