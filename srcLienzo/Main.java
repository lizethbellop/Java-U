public class Main {
    public static void main(String[] args){
        Terreno terreno = new Terreno(100,100);
        terreno.areaEfectiva(20);

        System.out.println(terreno.toString());
    }
}
