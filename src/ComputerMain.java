import data.Computer;
import logic.ComputerSorter;

public class ComputerMain {
    public static void main(String[] args) {

        Computer[] computers = {
                new Computer("Asus Zenbook", 3000, 4096),
                new Computer("Lenovo ThinkPad T460", 2400, 16384),
                new Computer("Dell XPS", 5000, 32768)
        };

        ComputerSorter.sortComputersByUserInput(computers);

    }
}
