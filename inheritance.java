package inheritance;

public class inheritance {
    public static void main(String[] args) {
        balok obj = new balok();
        obj.l = 15;
        obj.p = 20;
        obj.t = 10;
        obj.volume();
        obj.luasPermukaan();

        bola a = new bola();
        a.r = 15;
        a.luasPermukaan();
        a.volume();

        limasSetiga b = new limasSetiga();
        b.luasAlas = 20;
        b.luasSisiTegak = 30;
        b.luasAlas = 25;
        b.luasPermukaan();
        b.volume();


        Tabung c = new Tabung();
        c.selimutTabung = 25;
        c.alasTabung = 20;
        c.tutupTabung = 30;
        c.luasPermukaan();
        c.volume();
    }
}
