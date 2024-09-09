package modell;

import java.util.Random;

public class MindentudoGep {

    private static Random rnd = new Random();

    private int[] lottoSzelveny;
    private String totoSzelveny;
    private String[] dalok;

    public MindentudoGep() {
        this(new String[0]);
    }

    public MindentudoGep(String dal) {
        this(new String[]{dal});
    }

    public MindentudoGep(String dalok[]) {
        this.ujraindit();
        if (!(dalok == null || dalok.length == 0 || dalok[0].isBlank())) {
            dalokatFelvesz(dalok);
        }
    }

    public void ujraindit() {
        this.lottoSzelveny = generalLottoSzelveny();
        this.totoSzelveny = generalTotoSzelveny();
        this.dalok = dallalFeltolt();
    }

    private int[] generalLottoSzelveny() {
        int[] szelveny = new int[5];
        for (int i = 0; i < szelveny.length; i++) {
            szelveny[i] = rnd.nextInt(1, 91);
        }

        return szelveny;
    }

    public String kerLottoSzelveny() {
        String szelveny = "Lottó szelvény:\n";
        for (int i = 0; i < this.lottoSzelveny.length; i++) {
            szelveny += this.lottoSzelveny[i] + ", ";
        }
        return szelveny;
    }

    private String generalTotoSzelveny() {
        String szelveny = "1 2 3 4 5 6 7 8 9 10 11 12 13 13+1\n";
        for (int i = 0; i < 13; i++) {
            int szam = rnd.nextInt(1, 4);
            if (szam == 3) {
                szelveny += "x ";
            } else {
                szelveny += szam + " ";
            }
        }
        return szelveny;
    }

    public String kerTotoSzelveny() {
        String szelveny = "Totó szelvény:\n" + this.totoSzelveny;
        return szelveny;
    }

    public String kerDal() {
        int index = rnd.nextInt(0, this.dalok.length);
        return "A dal címe:\n" + this.dalok[index];
    }

    public void ujDal(String dal) {
        this.dalok[this.dalok.length - 1] = dal;
    }

    private String[] dallalFeltolt() {
        String[] dalok = new String[]{"Cold Hearted Man", "Bohemian Rhapsody", "Starman", "Idegen"};
        return dalok;
    }

    private void dalokatFelvesz(String[] dalok) {
    }
}
