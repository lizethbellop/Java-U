public class Localidad {
    private String cp;
    private String estado;
    private String municipio;

    public Localidad(String cp, String estado, String municipio){
        this.cp = cp;
        this.estado = estado;
        this.municipio = municipio;
    }

    public String getCp() {
        return cp;
    }

    public String getEstado() {
        return estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "Cp='" + cp + '\'' +
                ", Estado='" + estado + '\'' +
                ", Municipio='" + municipio + '\'' +
                '}';
    }
}
