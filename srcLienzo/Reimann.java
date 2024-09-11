public class Reimann {

    public Reimann(){

    }

    public static double calcularArea(double xInicial, double xFinal, int numeroPasos, Terreno terreno){
        double resultado = 0.0;
        double incremento = (xFinal - xInicial) / numeroPasos;
        double semiIncremento = incremento / 2;
        double x = xInicial;


        //Calcula la suma de los rectangulos
        for(int i = 0; i < numeroPasos; i++){
            resultado += incremento + terreno.desperdicio(x + semiIncremento);
            x += incremento;
        }

        return resultado;
    }

}
