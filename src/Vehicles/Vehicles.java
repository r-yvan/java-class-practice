package Vehicles;

public abstract class Vehicles {
    public void move(Vehicles car) {
        System.out.println(car + "can move");
    }
    public void speed(String car) {
        System.out.println(car + "has speed");
    }
    public void playMusic(String car) {
        System.out.println("Playing music with " + car);
    }
    public void watchVideo(String car) {
        System.out.println("Watching video with " + car);
    }
}
