package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

//    Ukol: zofka kresli 4 domy vedle sebe a prase / pomoci cyklu FOR a metod "nakresliDum", "posunSe" a "nakresliNohy"

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDum();

        for (int i = 0; i < 3; i++) {

            posunSe();

            nakresliDum();

        }

        posunSe();

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(180);
        zofka.penDown();

        nakresliDum();

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(100);

        nakresliNohy();

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(115);
        zofka.move(150);
        zofka.turnRight(90);

        nakresliNohy();
    }

    public void nakresliDum() {

        for (int i = 0; i < 2; i++) {
            zofka.move(150);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    public void posunSe() {

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void nakresliNohy() {
        zofka.penDown();
        zofka.turnRight(25);
        zofka.move(30);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(130);
        zofka.penDown();
        zofka.move(30);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
