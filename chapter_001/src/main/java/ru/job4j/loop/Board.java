package ru.job4j.loop;

/**
 * Шахмотная доска в псевдографике.
 * @author Yuriy Averianov.
 * @since 21.07.2018.
 */
public class Board {
    /**
     * Метод отрисовки шахмотной доски.
     * @param width ширина доски.
     * @param height высота доски.
     * @return возвращает отрисованную доску.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for(int j = 0; j < width; j++ ) {
            for(int i = 0; i < height; i++) {
                if((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
