package logic;

import data.Computer;

import java.util.Comparator;

public class MemoryComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer computer1, Computer computer2) {
        return Integer.compare(computer1.getMemory(), computer2.getMemory());
    }
}
