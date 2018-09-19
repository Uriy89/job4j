package ru.job4j.tracker;
public class Item {
    private String id;
    public String name;
    public String desc;
    public long create;
    public Item(String name, String desc, long create) {
        this.name = name;
        this.desc = desc;
        this.create = create;
    }
    public Item(String id, String name) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public String getDesc() {
        return this.desc;
    }
    public long getCreate() {
        return this.create;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
    @Override
    public String toString() {
        return "Item{id='" + id + '\''
                + ", name='" + name + '\''
                + ", desc='" + desc + '\''
                + ", create=" + create + '}';
    }
}
