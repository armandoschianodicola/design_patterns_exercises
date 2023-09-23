package strategy;

public abstract class Pet {

    int hunger;
    int size;

    abstract boolean canGrow();
    abstract String cry();

}
