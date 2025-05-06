package Exercicio;

public class Cilindro extends Forma implements Volume{

    private double altura;

    public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
        super(coordenadaX, coordenadaY, raio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "Altura:" + altura + "\n";
        return aux;

    }

    @Override
    double calcularArea() {
        return 0;
    }

    public double calcularVolume(){
        return -2;
    }
}
