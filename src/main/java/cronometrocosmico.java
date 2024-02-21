import java.util.Scanner;

public class CronometroCosmico {
    private final double diasEnLaTierra;
    private final double diasEnElNuevoPlaneta;


    public CronometroCosmico(double diasEnLaTierra, double diasEnElNuevoPlaneta) {
        this.diasEnLaTierra = diasEnLaTierra;
        this.diasEnElNuevoPlaneta = diasEnElNuevoPlaneta;
    }

    public long convertirATiempoTerrestre() {
        double segundos = diasEnLaTierra * 86400;
        return Math.round(segundos);
    }

