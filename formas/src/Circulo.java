public class Circulo extends forma {
    double raio;
    double pi=3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea() {
        return pi * raio * raio;
    }
}
