package primerproblema;

public class Ortoedro extends FiguraTridimensional{

    //ATRIBUTOS
    double ancho;
    double altura;
    double base;
    final static int caras = 6;
    //METODOS


    public Ortoedro(double ancho, double altura, double base) {
        this.ancho = ancho;
        this.altura = altura;
        this.base = base;
    }

    public Ortoedro() {
        this.ancho = 1;
        this.altura = 1;
        this.base = 1;
    }

    @Override
    public String toString() {
        return "La figura es un Ortoedro";
    }

    @Override
    public double calcularVolumen() {
        return ancho*base*altura;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * base) + 2 * (ancho * altura) + 2 * ( base * altura);
    }
}
