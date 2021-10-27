package primerproblema;

public class TetraedroRegular extends FiguraTridimensional {


    //ATRIBUTOS
    double arista;
    final static int caras = 4;

    //METODOS


    public TetraedroRegular(double arista) {
        this.arista = arista;
    }

    @Override
    public String toString() {
        return "La figura es un TetraedroRegular";
    }

    @Override
    public double calcularVolumen() {
        return Math.sqrt(2)*arista*Math.pow(arista, 3) / 12;
    }

    @Override
    public double calcularSuperficie() {
        return Math.sqrt(3)*Math.pow(arista, 2);
    }
}
