public class Main {
    public static void main(String[] args) {

        forma[] formas = new forma[3];


        formas[0] = new Circulo(4);
        formas[1] = new Retangulo(10, 5);
        formas[2] = new Triangulo(10, 10);


        for (forma forma : formas) {
            System.out.printf("Área: %.2f\n", forma.calcularArea());
        }
    }
}