package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadoraApp {
    public static void main(String[] args) {
        //Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("USB","Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);
        //Crear objetos de tipo computadora
        Computadora computadoraLenovo =
                new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        //Objeto computadora
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("Usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell",
                monitorDell, tecladoDell, ratonDell);

        //Creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostarOrden();

        //Computadora Mac
        Monitor monitorMac = new Monitor("Mac", 27);
        Teclado tecladoMac = new Teclado("Bluetooth", "Mac");
        Raton ratonMac = new Raton("bluetooth", "Mac");
        Computadora computadoraIMac = new Computadora("iMac",
                monitorMac, tecladoMac, ratonMac);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostarOrden();


    }
}