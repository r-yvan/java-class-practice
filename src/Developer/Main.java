public class Main {
    public static void main(String[] args) {
        Developer samuella = new Developer();
        Computer desktop = new Computer("Desktop");
        Computer laptop = new Computer("Laptop");
        samuella.writeCode(desktop.type);
    }
}