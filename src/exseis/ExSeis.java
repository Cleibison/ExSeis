/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exseis;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner entrada = new Scanner (System.in);
           float base;
           float altura;
           float area;
           System.out.println("DIgite a base do triangulo");
           base = entrada.nextFloat();
           System.out.println("Digite a altura do triamgulo");
           altura = entrada.nextFloat();
           area = (base*altura)/2;
           
           System.out.println("A area do triangulo é "+" "+area);
    }
    
}
