package inheritance;

public class limasSetiga extends BangunRuang{
    double luasAlas;
    double tSegitiga;
    double tLimas;
    double luasSisiTegak;

    double luasPermukaan(){
       double luasPermukaan = luasSisiTegak + luasAlas;
       System.out.println("Luas Permukaan : "+luasPermukaan);
       return luasPermukaan;
    }

    double volume(){
        double volume = 1/3 * luasAlas * tLimas;
        System.out.println("Volume Limas Segitiga : "+volume);
        return volume;
    }
}
