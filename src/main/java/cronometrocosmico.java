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

    public long convertirANuevoPlaneta() {
        double segundos = diasEnLaTierra * (86400 / diasEnElNuevoPlaneta);
        return Math.round(segundos);
    }


    public String visualizarTiempoTerrestre() {
        double segundos = diasEnLaTierra * 86400;
        double minutos = segundos / 60;
        double horas = minutos / 60;
        double dias = horas / 24;
        double años = dias / 365;
        return "Tiempo en la Tierra: " + (int) segundos + " segundos, " + (int) minutos + " minutos, " + (int) horas + " horas, " + (int) dias + " días, " + (int) años + " años";
    }


    public String visualizarTiempoNuevoPlaneta() {
        double segundos = diasEnLaTierra * (86400 / diasEnElNuevoPlaneta);
        double minutos = segundos / 60;
        double horas = minutos / 60;
        double dias = horas / 24;
        double años = dias / 365;
        return "Tiempo en el nuevo planeta: " + (int) segundos + " segundos, " + (int) minutos + " minutos, " + (int) horas + " horas, " + (int) dias + " días, " + (int) años + " años";
    }


    public String identificarLimitesDeRepresentacion() {
        long maximoSegundos = Long.MAX_VALUE;
        long maximoMinutos = maximoSegundos / 60;
        long maximoHoras = maximoMinutos / 60;
        long maximoDias = maximoHoras / 24;
        long maximoAños = maximoDias / 365;


        long maximoSegundosEnNuevoPlaneta = (long) (maximoSegundos * (86400 / diasEnElNuevoPlaneta));
        long maximoMinutosEnNuevoPlaneta = maximoSegundosEnNuevoPlaneta / 60;
        long maximoHorasEnNuevoPlaneta = maximoMinutosEnNuevoPlaneta / 60;
        long maximoDiasEnNuevoPlaneta = maximoHorasEnNuevoPlaneta / 24;
        long maximoAñosEnNuevoPlaneta = maximoDiasEnNuevoPlaneta / 365;

        return "Máximo tiempo representable en la Tierra: " + maximoSegundos + " segundos, " + maximoMinutos + " minutos, " + maximoHoras + " horas, " + maximoDias + " días, " + maximoAños + " años" +
                "\nMáximo tiempo representable en el nuevo planeta: " + maximoSegundosEnNuevoPlaneta + " segundos, " + maximoMinutosEnNuevoPlaneta + " minutos, " + maximoHorasEnNuevoPlaneta + " horas, " + maximoDiasEnNuevoPlaneta + " días, " + maximoAñosEnNuevoPlaneta + " años";
    }