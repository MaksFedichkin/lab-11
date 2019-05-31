package MyPack1;

import MyPack.*;

import java.nio.Buffer;
import java.util.Scanner;

class TestBalance {
    public static void main(String args[]) {
     /* Класс Balance объявлен как public, поэтому им можно
     воспользоваться и вызвать его конструктор . */
        Balance test = new Balance("J.J. Jaspe rs",99.88);
        test.show(); // можно также вызвать метод show()
    }
}
