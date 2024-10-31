package Enum;

public enum TipoDocumento {
    CPF {
        @Override
        public String geraCpf() {
            return GeraCpfCnpj.cpf();
        }
    },CNPJ {
        @Override
        public String geraCpf() {
            return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraCpf();
}
