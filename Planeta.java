public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaAlSol;
    private boolean esObservable;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    public void mostrarValores() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al Sol: " + distanciaAlSol + " km");
        System.out.println("Es Observable: " + esObservable);
        double densidad = calcularDensidad();
        System.out.println("Densidad: " + densidad + " kg/km³");
    }

    
    public double calcularDensidad() {
        return masa / volumen;
    }

    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta planeta2 = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, true);

      
        System.out.println("Detalles del Planeta 1:");
        planeta1.mostrarValores();
        System.out.println();
        System.out.println("Detalles del Planeta 2:");
        planeta2.mostrarValores();
    }
}
