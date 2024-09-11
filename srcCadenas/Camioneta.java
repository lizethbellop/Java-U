public class Camioneta {
    private int year;
    private String marca;
    private String placa;

    public Camioneta(int year, String marca, String placa){
        this.year = year;
        this.marca = marca;
        this.placa = placa;
    }

    public int getYear() {
        return year;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "Year=" + year +
                ", Marca='" + marca + '\'' +
                ", Placa='" + placa + '\'' +
                '}';
    }
}
