package com.exercicios.aula2.exercicio5;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Conta {
    
    private String nome, cpf, banco, endereco;
    private LocalTime horarioAtual;
    private int identificadorConta;
    private double saldo = 0;

    DateTimeFormatter formatHorario = DateTimeFormatter.ofPattern("HH:mm:ss");

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHorarioAtual() {
        return horarioAtual;
    }

    public void setHorarioAtual(LocalTime horarioAtual) {
        this.horarioAtual = horarioAtual;
    }

    public int getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(int identificadorConta) {
        this.identificadorConta = identificadorConta;
    }
    
    public Conta(String nome, String cpf, String endereco, LocalTime horarioAtual, int identificadorConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.horarioAtual = horarioAtual;
        this.identificadorConta = identificadorConta;
    }
    public Conta() {
    }

    public void saque(double valor) {
        if (valor >= this.saldo) {
            this.saldo = -valor;
            System.out.println("Valor sacado: " + valor);
            System.out.println("Saldo na conta: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque!");
            System.out.println("Saldo na conta: " + this.saldo);
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo = +valor;
            System.out.println("Valor depositado: " + valor);
            System.out.println("Saldo na conta: " + this.saldo);
        } else {
            System.out.println("Apenas valores positivos são permitidos para depósito!");
            System.out.println("Saldo na conta: " + this.saldo);
        }

    }
    public void verificarSaldo() {
        System.out.println("O saldo na sua conta é: " + this.saldo);
    }

    public void verificarHorario() {

        System.out.println("O horário de entrada foi: " + formatHorario.format(this.horarioAtual));
    }

    public void verificarInformacoes() {
        System.out.println("Nome do titular: "+ this.nome);
        System.out.println("CPF do titular: "+ this.cpf);
        System.out.println("Endereço do titular: "+ this.endereco);
        verificarHorario();
        verificarSaldo();
    }
    




}
