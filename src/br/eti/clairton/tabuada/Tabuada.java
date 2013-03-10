package br.eti.clairton.tabuada;

/**
 * Mostra a Tabuada
 *
 * @author Clairton Rodrigo Heinzen <clairton.rodrigo@gmail.com>
 */
public class Tabuada {

    public static void main(String[] args) {
        Integer multiplicando;
        Integer multiplicador;
        Integer produto;

        for (multiplicador = 0; multiplicador <= 10; multiplicador++) {
            System.out.println("Tabuada " + multiplicador);

            for (multiplicando = 0; multiplicando <= 10; multiplicando++) {
                produto = multiplicador * multiplicando;
                System.out.println(multiplicador + " X " + multiplicando + " = " + produto);

            }

            System.out.println("\n\n");
        }
    }
}
