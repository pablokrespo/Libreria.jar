package Libreria;
import Areas.Circulo;
import Areas.Rectangulo;
import Areas.Triangulo;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Libreria {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Scanner sc = new Scanner(System.in);
        double altura;
        double base;
        double radio;

        System.out.println("Ingrese el radio del circulo: ");
        radio = sc.nextDouble();
        System.out.println("Ingrese la base del rectangulo");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = sc.nextDouble();
        System.out.println("Ingrese la base del triangulo: ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura = sc.nextDouble();

        JOptionPane.showMessageDialog(null,"El area del circulo es: " +circulo.areaCirculo(radio) + " metros");
        JOptionPane.showMessageDialog(null,"El area del rectangulo es: " +rectangulo.areaRectangulo(base, altura) + " metros");
        JOptionPane.showMessageDialog(null,"El area del triangulo es: " +triangulo.areaTriangulo(base, altura) + " metros");


    }
}
