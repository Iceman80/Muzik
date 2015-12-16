public class Muzik {
    static void tune(Instrument i) {
        i.play(Zvuk.Ре);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Instrument[] orkestra = {new Bass(), new Gitar(), new Piano()};
        Muzik.tuneAll(orkestra);
    }

}
