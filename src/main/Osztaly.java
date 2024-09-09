package main;

import modell.MindentudoGep;

public class Osztaly {

    public static void main(String[] args) {
        MindentudoGep mg = new MindentudoGep();
        System.out.println(mg.kerLottoSzelveny());
        System.out.println(mg.kerTotoSzelveny());
        System.out.println(mg.kerDal());
    }

}
