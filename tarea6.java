
import java.util.Scanner;

abstract class Figura {
    abstract double calcularArea();
    abstract void imprimirInformacion();
}

class Cuadrado extends Figura {
    double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    double calcularArea() {
        return lado * lado;
    }
    
    @Override
    void imprimirInformacion() {
        System.out.println("Cuadrado de lado " + lado + " y área " + calcularArea());
    }
}

class Circulo extends Figura {
    double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    void imprimirInformacion() {
        System.out.println("Círculo de radio " + radio + " y área " + calcularArea());
    }
}

public class HerenciaMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        cuadrado.imprimirInformacion();
        
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble()