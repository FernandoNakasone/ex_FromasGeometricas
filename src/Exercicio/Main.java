package Exercicio;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("#0.00");

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Cilindro(5,8,10,5));
        lista.add(new Circulo(5,8,10));
        lista.add(new Cilindro(15,28,110,10));

        for(Forma f : lista){
            System.out.println(f.getClass());
            System.out.print(f);
            System.out.println("Area:" + dF.format(f.calcularArea()));
            if(f instanceof Volume){
                System.out.println("Volume:" + ((Volume) f).calcularVolume());
            }
            System.out.println("-------------------------------");
        }

    }
}
