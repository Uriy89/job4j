package ru.job4j;
public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder tri = new StringBuilder();
        tri.append("   +   ");
        tri.append("  +++  ");
        tri.append(" +++++ ");
        tri.append("+++++++");
        return tri.toString();
    }
}
