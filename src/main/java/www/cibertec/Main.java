package www.cibertec;

public class Main {
     static void main(String[] args) {
        double venta = 0;

        for (int contador = 1; contador <= 6; contador++) {

            if (contador == 1) {
                venta = 1200;
            } else if (contador == 2) {
                venta = 950;
            } else if (contador == 3) {
                venta = 1800;
            } else if (contador == 4) {
                venta = 2600;
            } else if (contador == 5) {
                venta = 700;
            } else {
                venta = 3100;
            }

            if (venta >= 2500) {
                System.out.println("Venta : " + contador + " " + venta + " = Venta alta :) ");
            } else if (venta >= 1000) {
                System.out.println("Venta : " + contador + " " + venta + " = Venta media :/ ");
            } else {
                System.out.println("Venta : " + contador + " " + venta + " = Venta baja :( ");

            }
        }
    }
}
