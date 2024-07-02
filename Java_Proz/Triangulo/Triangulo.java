package Triangulo;
public class Triangulo {
    float base;
    float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea() {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo(2.5f, 3f);
        float area = t.calcularArea();
        System.out.println("Área do triângulo: " + area);
    }
}

