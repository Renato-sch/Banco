import java.util.ArrayList;

public class FilaDeAtendimento {

    private ArrayList<Pessoa> fila = new ArrayList<>();

    //criar fila de atendimento

    public FilaDeAtendimento(){
        this.fila = new ArrayList<>();
    }

    public void setFila(ArrayList<Pessoa> fila) {
        this.fila = fila;
    }
    
    public ArrayList<Pessoa> getFila() {
        return fila;
    }

    public void adicionarPessoa(Pessoa p){ //copiar a parte de leitura.
/*
        System.out.println("Digite o nome da pessoa para adicionar na fila");
        p.setNome(ler.nextLine());

        System.out.println("Digite o cpf da pessoa");
        p.setNome(ler.nextLine());

        System.out.println("Digite o interesse da pessoa");
        p.setNome(ler.nextByte());
*/
        this.fila.add(p);
    }

    public int obterQuantidadeDePessoas(){

        return this.fila.size();

    }

    public Pessoa atenderPessoa(){
        Pessoa p1 = this.fila.get(0);
        this.fila.remove(0);
        return p1;
    }

    public void apagarTodos(){
        this.fila.clear();
    }

    public Pessoa pesquisarPeloCpf(String cpf){

        int cont = this.fila.size();
        int num = -1; // numero negativo significa não encontrado
        Pessoa p = new Pessoa();

        while(cont > 0 ){
            if (this.fila.get(cont).getCpf().equals(cpf)){
                num = cont;
            }
            cont--;
        }

        if(num>=0){
           p = this.fila.get(num);
           return p;
        }

        //não encontrou ninguem pelo cpf
        
        return null;
        
    }


    public ArrayList<Pessoa> ProcurarPessoasPeloInteresse(byte interesse){
        ArrayList<Pessoa> interesse_comum = new ArrayList<>(); 
        int cont = this.fila.size();
        boolean flag = false;

        while(cont > 0 ){
            if (this.fila.get(cont).getInteresse() == interesse){
                flag = true;
                interesse_comum.add(this.fila.get(cont));
            }
            cont--;
        }

        if(flag == true){
           return interesse_comum; 
        }       

        //não encontrou ninguém por interesse
        
        return null;
    }

    @Override
    public String toString() {
        return "Fila De Atendimento" + fila;
    }



}
