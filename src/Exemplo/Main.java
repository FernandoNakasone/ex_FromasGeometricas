package Exemplo;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto(1,"A"));
        lista.add(new Produto(2,"B"));
        lista.add(0,new Produto(3,"C"));


//        for tradicional --> controle de posição
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getId());
        }

//        for each ou for generico
        for(Produto e : lista){
            System.out.println(e.getNome());
        }

        System.out.println(lista);

    }
}