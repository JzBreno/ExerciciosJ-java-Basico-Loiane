package Enum;

public class Pessoa {

    private TipoDocumento tipoDocumento;
    private String numero;

    public Pessoa() {
    }

    public Pessoa(String numero, TipoDocumento tipoDocumento) {
        this.numero = numero;
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "tipoDocumento=" + tipoDocumento +
                ", numero='" + numero + '\'' +
                '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
