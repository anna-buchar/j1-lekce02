package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO tady bude kód

    int delkaStrany = 200;
    int delkaNozicky = delkaStrany / 5;

   zofka.turnRight(90);
    nakreslitDomecek(delkaStrany);
    zofka.turnLeft(45);
    nakreslitDveNozicky(delkaNozicky);
    zofka.turnLeft(135);
    zofka.move(delkaStrany);
    zofka.turnLeft(90);
    nakreslitDveNozicky(delkaNozicky);


  }

  public void nakreslitDomecek(int delkaStrany) {
    for (int i = 0; i < 4; i++) {
      zofka.move(delkaStrany);
      zofka.turnRight(90);
    }
    zofka.penUp();
    zofka.move(delkaStrany);
    zofka.penDown();
    zofka.turnRight(45);
    zofka.move(delkaStrany*(0.7));
    zofka.turnRight(90);
    zofka.move(delkaStrany*(0.7));
  }

  public void nakreslitDveNozicky(int delkaNozicky) {
    zofka.turnLeft(45);
    zofka.penDown();
    zofka.move(delkaNozicky);
    zofka.penUp();
    zofka.turnRight(135);
    zofka.move(delkaNozicky*(1.5));
    zofka.turnRight(135);
    zofka.penDown();
    zofka.move(delkaNozicky);
  }

}
