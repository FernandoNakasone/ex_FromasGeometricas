package Exercicio;

public class Circulo extends Forma {

    public Circulo(int coordenadaX, int coordenadaY, double raio) {
        super(coordenadaX, coordenadaY, raio);
    }

    @Override
    double calcularArea() {
        double area;
        area = 2 * 3.14 * getRaio();
        return area;
    }

}
