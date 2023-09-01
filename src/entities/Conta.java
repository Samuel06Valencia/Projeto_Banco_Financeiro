package entities;

public class Conta {
    private String name;
    private int numConta;
    private int numAgencia;
    private String cpf;
    private double saldo;
    private double saque;

    public Conta() {
    }

    public Conta(String name, int numConta, int numAgencia, String cpf) {
        this.name = name;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.cpf = cpf;
    }

    public Conta(String name, int numConta, int numAgencia, String cpf, double saldo) {
        this.name = name;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public Conta(String name, int numConta, int numAgencia, String cpf, double saldo, double saque) {
        this.name = name;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.cpf = cpf;
        this.saldo = saldo;
        this.saque = saque;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public Double adicionaSaldo(double saldo) {
        return this.saldo += saldo;
    }
    public Double adicionaSaque(double saque) {
        return  saldo = saldo - saque;
    }

    public String toString() {
        return "Nome: "+name+", número da Conta: "+numConta+", Agência: "+numAgencia+", Saldo Atual: "+String.format("%.3f",saldo);
    }
    public String totalSaldo() {
        return "Nome: "+name+", número da Conta: "+numConta+", Agência: "+numAgencia+", Saldo Atual: "+String.format("%.3f",adicionaSaldo(saldo));
    }
    public String totalSaque() {
        return "Nome: "+name+", número da Conta: "+numConta+", Agência: "+numAgencia+", Saldo Atual: "+String.format("%.3f",adicionaSaque(saque));
    }
}
