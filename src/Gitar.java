public class Gitar implements Instrument {
    public void play(Zvuk z) {
        System.out.println(this + " играет " + Zvuk.До);
    }

    public String toString() {
        return "Гитара";
    }
}
