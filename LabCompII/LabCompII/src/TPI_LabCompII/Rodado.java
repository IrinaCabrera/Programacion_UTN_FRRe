package TPI_LabCompII;
import java.io.*;

public class Rodado extends Adminitracion implements Serializable{
    private String tipoRodado;
    private String marcaRodado;
    private double diametroRueda;
    private String tipoFreno;
    private String talleCuadro;

    //contructor

    public Rodado(String tipoRodado, String marcaRodado, double diametroRueda, String tipoFreno, String talleCuadro) {
        this.tipoRodado=tipoRodado;
        this.marcaRodado = marcaRodado;
        this.diametroRueda = diametroRueda;
        this.tipoFreno = tipoFreno;
        this.talleCuadro = talleCuadro;
    }

    //Setter/Getter

    public String getTipoRodado() { return tipoRodado; }

    public void setTipoRodado(String tipoRodado) { this.tipoRodado = tipoRodado; }

    public String getMarcaRodado() {
        return marcaRodado;
    }

    public void setMarcaRodado(String marcaRodado) { this.marcaRodado = marcaRodado; }

    public double getDiametroRueda() { return diametroRueda; }

    public void setDiametroRueda(double diametroRueda) { this.diametroRueda = diametroRueda; }

    public String getTipoFreno() { return tipoFreno; }

    public void setTipoFreno(String tipoFreno) { this.tipoFreno = tipoFreno; }

    public String getTalleCuadro() {
        return talleCuadro;
    }

    public void setTalleCuadro(String talleCuadro) {
        this.talleCuadro = talleCuadro;
    }

    //metodos

    @Override
    public String toString() {
        return "Rodado{" +
                "tipoRodado='" + tipoRodado + '\'' +
                ", marcaRodado='" + marcaRodado + '\'' +
                ", diametroRueda=" + diametroRueda +
                ", tipoFreno='" + tipoFreno + '\'' +
                ", talleCuadro=" + talleCuadro +
                '}';
    }

}
