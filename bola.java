package inheritance;

public class bola extends BangunRuang{
    double r;

    double volume(){
        double volume = 4/3 * Math.PI * r * r * r;
        return volume;
    }
    double luasPermukaan(){
        double luasPermukaan = 4 * Math.PI * r * r;
        return luasPermukaan;
    }
}
