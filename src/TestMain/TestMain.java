package TestMain;

import Classes.Leon;
import Classes.Tigre;

public class TestMain {
    public static void main(String[] args) {
        Leon leon = new Leon("Terranova", 1.80f, 100f, 100f, "Leon", 100, 100, 100, 100);
        leon.comer();
        leon.dormir();
        leon.comunicarse();
        leon.correr();


    }
}
