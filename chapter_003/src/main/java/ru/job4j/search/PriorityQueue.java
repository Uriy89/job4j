package ru.job4j.search;
import java.util.LinkedList;
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод должен вставлять элемент в нужную позицию.
     * Позиция определяется по полю "приоритет".
     * Для вставки использовать add(int index, E value)
     */
    public void put(Task task) {
        int size = tasks.size();
        for (int index = 0; index < this.tasks.size(); index++) {
            if (task.getPriority() < tasks.get(index).getPriority()) {
                size = index;
                break;
            }
        }
        tasks.add(size, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}
