package section11;

public class mainHewan {
    public static void main(String[] args) {
        hewan hwn = new hewan();
        hwn.name = "Binatang";
        hwn.tampil();

        herbivor hbvr = new herbivor();
        hbvr.name = "Sapi";
        hbvr.typeFoods = "Tumbuhan";
        hbvr.teeth = "Tumpul";
        hbvr.type = "Herbivor";
        hbvr.tampil();

        karnivor krnvr = new karnivor();
        krnvr.name = "Singa";
        krnvr.typeFoods = "Daging";
        krnvr.teeth = "Tajam";
        krnvr.type = "Carnivor";
        krnvr.tampil();

        omnivor omnvr = new omnivor();
        omnvr.name = "Beruang Madu";
        omnvr.typeFoods = "Daging & Buah";
        omnvr.teeth = "Tajam";
        omnvr.type = "Omnivor";
        omnvr.tampil();
    }
}
