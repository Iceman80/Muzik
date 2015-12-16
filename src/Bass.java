public class Bass implements Instrument {
    public void play(Zvuk z) {
        System.out.println(this + " играет " + z);
    }

    public String toString() {
        return "Барабан";
    }
}
