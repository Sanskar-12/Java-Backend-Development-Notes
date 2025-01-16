
class Computer {
    public String printer(String sentence) {
        return sentence;
    }

    public void playMusic() {
        System.out.println("Playing Music...");
    }

}

public class Example1 {
    public static void main(String[] args) {
        Computer comp = new Computer();

        // accessing the printer method from Computer Class
        String res = comp.printer("Hello");
        System.out.println(res);

        // accessing the playMusic method from Computer Class
        comp.playMusic();
    }
}
