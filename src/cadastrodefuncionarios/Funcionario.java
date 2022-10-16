package cadastrodefuncionarios;

public class Funcionario {
    public String nome;
    public String cpf;
    public double salario;
    public String senha;
    public int subordinados;

    public Funcionario(String nome, String cpf, double salario, String senha, int subordinados) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.senha = senha;
        this.subordinados = subordinados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) {
        this.subordinados = subordinados;
    }
    
    
}
