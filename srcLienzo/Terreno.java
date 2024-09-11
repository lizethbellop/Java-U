public class Terreno extends Lienzo {
    private double largo;
    private double ancho;

    public Terreno(double largo, double ancho){
        super((int)ancho);

        this.largo = largo;
        this.ancho = ancho;

        graficarTerreno();

    }

    public double superior(double x){
        return (70 + 8 * Math.sin(x / 35) + Math.cos(x / 20));
    }

    public double inferior(double x){
        return (50 + 5 * Math.cos(x / 10) * Math.sin(x / 15));
    }

    public double desperdicio(double x){
        return (superior(x) - inferior(x));
    }

    public void areaEfectiva(int presicion){

        double areaEfec = Reimann.calcularArea(0, ancho, presicion, this);
        System.out.println("El area efectiva es: " + areaEfec);

    }

    public void graficarTerreno(){
        for(int i = 0; i < (int) largo; i++){
            setPen(i, (int) superior((int) i), '*');
            setPen(i, (int) inferior((int) i), '*');
        }

        dibujar();

    }

    @Override
    public String toString(){
        return "Este terreno es de " + largo + " x " + ancho + "\n";
    }


}
