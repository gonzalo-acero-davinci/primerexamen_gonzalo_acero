package primerproblema;

public class Main {
    public static void main(String[] args) {
        Ortoedro ortoedro = new Ortoedro();
        ortoedro.calcularVolumen();
        ortoedro.calcularSuperficie();
        ortoedro.toString();

        TetraedroRegular tetraedroregular = new TetraedroRegular();
        tetraedroregular.calcularSuperficie();
        tetraedroregular.calcularVolumen();
        tetraedroregular.toString();


        Cubo cubo = new Cubo();
        cubo.calcularSuperficie();
        cubo.calcularVolumen();
        cubo.toString();






    }
}
