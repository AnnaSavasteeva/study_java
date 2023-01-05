package homeworks.hw2;

import java.util.ArrayList;
import java.util.List;

public class Bar {

    private final char barName;
    private final List<Integer> disks = new ArrayList<>();

    public Bar(char name) {
        this.barName = name;
    }

    public char getBarName() {
        return barName;
    }

    public List<Integer> getDisks() {
        return disks;
    }
}
