package data;

public class Computer implements Comparable<Computer> {
    private String name;
    private int cpu;
    private int memory;


    public Computer(String name, int cpu, int memory) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
    }

    public int getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public int compareTo(Computer computer) {
        return this.name.compareTo(computer.name);
    }

    @Override
    public String toString() {
        return String.format("Nazwa: %s, taktowanie procesora: %d Hz, ilość pamięci: %d MB.", name, cpu, memory);
    }
}
