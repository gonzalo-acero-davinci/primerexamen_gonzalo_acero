package primerproblema;

public class Cubo extends FiguraTridimensional{

    //ATRIBUTOS
    double lado;
    final static double caras = 6;

    //METODOS


    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    @Override
    public double calcularSuperficie() {
        return 6*(Math.pow(lado, 2));
    }

    @Override
    public String toString() {
        return "La figura es un Cubo";
    }
}
