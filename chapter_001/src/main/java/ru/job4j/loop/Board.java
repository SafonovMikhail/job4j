package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                //печатаем X - width раз.
                System.out.print("X");
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void paintBlackWhite(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                    //печатаем X - width раз.
                    System.out.print ("X");
                } else {
                    System.out.print (" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println ();
        }


    }
    public static void main (String[]args){
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paintBlackWhite (3,3);
        System.out.println();
        paintBlackWhite(4,4);
    }
}