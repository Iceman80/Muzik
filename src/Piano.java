public class Piano implements Instrument {
    public void play(Zvuk z) {
        System.out.println(this + " играет " + z);
    }

    public String toString() {
        return "Пианино";
    }
}
