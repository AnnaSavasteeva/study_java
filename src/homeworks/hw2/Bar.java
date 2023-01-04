package homeworks.hw2;

import java.util.ArrayList;
import java.util.List;

public class Bar {

    private char barName;
    private List<Integer> disks = new ArrayList<>();

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
