package logic;

import data.Computer;

import java.util.Arrays;
import java.util.Scanner;

public class ComputerSorter {
    private static final String RAM = "ram";
    private static final String CPU = "cpu";
    private static final String NAME = "nazwa";

    public static void sortComputersByUserInput(Computer[] computers) {
        MemoryComparator memoryComparator = new MemoryComparator();
        CpuComparator cpuComparator = new CpuComparator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Według jakiego czynnika chcesz posortować komputery?");
        System.out.println("Ram, cpu czy nazwa?");
        String sortFactor = scanner.nextLine();
        if (sortFactor.equalsIgnoreCase(NAME)) {
            Arrays.sort(computers);
        } else if (sortFactor.equalsIgnoreCase(RAM)) {
            Arrays.sort(computers, memoryComparator);
        } else if (sortFactor.equalsIgnoreCase(CPU)) {
            Arrays.sort(computers, cpuComparator);
        } else {
            System.out.println("Podano nieprawidłowy czynnik sortujący. Spróbuj ponownie.");
            return;
        }

        for (Computer computer : computers) {
            System.out.println(computer);
        }

    }


}
