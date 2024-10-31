package Enum;

public class testeDocumento {
    public static void main(String[] args) {
        for(TipoDocumento tipoDocumento : TipoDocumento.values()) {
            System.out.println(tipoDocumento+" "+tipoDocumento.geraCpf());


        }
        Pessoa p = new Pessoa();
        p.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        p.setNumero(p.getTipoDocumento().geraCpf());
        System.out.println(p.getTipoDocumento());
        System.out.println(p.getNumero());
    }
}
