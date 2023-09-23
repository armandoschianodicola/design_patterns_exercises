package strategy;

public class Cat extends Pet {
    
    String cry() {
        return "Miao";
    }

    boolean canGrow() {
        throw new UnsupportedOperationException("Unimplemented method 'canGrow'");
    }
}
