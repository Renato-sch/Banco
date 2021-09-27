public class Pessoa {
    private String nome;
    private String cpf;
    private byte interesse;

    public void setNome(String nome){
        this.nome = nome; 
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf; 
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setInteresse(byte interesse){
        this.interesse = interesse; 
    }

    public byte getInteresse(){
        return this.interesse;
    }

    @Override
    public String toString() {
        String texto;
        switch (this.interesse) {
            case 1:
                texto = "Pagamento de Conta";
                break;

            case 2:
                texto = "Recebimento de Salário";
                break;
        
            default:
                texto = "Outra Operação";
                break;
        }
        return "\nNome: " + nome + ", CPF: " + cpf + ", interesse " + texto + "}";
    }


}
