package com.exercicios.aula2.exercicio1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Conta {
    
    private String nome, cpf, banco, endereco;
    private LocalTime horarioAtual;
    private int identificadorConta;
    private double saldo = 0;
    private List<String> historico = new ArrayList<>();
    
    public List<String> getHistorico(){
        return historico;
    }
    
    public void setHistorico(List<String> historicoTransacoes){
        this.historico = historicoTransacoes;
    }
    
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

    public void pix(double saque) {
        if (this.saldo < saque) {
            System.out.println("Saldo insuficiente para o saque!");
            System.out.println("Saldo na conta: " + this.saldo);
        } else {

        }

    }

    public void transferencia(Main destino, double valor) {
        if (this.horarioAtual.getHour() <= 8 || this.horarioAtual.getHour() >= 19) {

        } else {

        }
    }

    public void verificarSaldo() {
        System.out.println("O saldo na sua conta é: " + this.saldo);
    }

    public void verificarHorario() {
        System.out.println("O horário de entrada foi: "+ this.horarioAtual);
    }

    public void verificarInformacoes() {
        System.out.println("Nome do titular: "+ this.nome);
        System.out.println("CPF do titular: "+ imprimeCpf());
        System.out.println("Endereço do titular: "+ this.endereco);
        verificarHorario();
        verificarSaldo();
    }
    
    public String alterarEndereco(String endereco){
        if (this.endereco.equals(endereco)) {
            System.out.println("O endereço informado é igual ao informado anteriormente!");
            return this.endereco;
        } else {
            System.out.println("Endereço alterado com sucesso!");
           return this.endereco = endereco;
 
        }
        
    }

    public void historicoTransacoes(){
        
    
    }
    
    
    
    
    
    
      //_VALIDADOR DE CPF E ADAPTADO______
      public boolean validaCpf() {
      // considera-se erro this.cpf's formados por uma sequencia de numeros iguais
      if (this.cpf.equals("00000000000") ||
      this.cpf.equals("11111111111") ||
      this.cpf.equals("22222222222") || this.cpf.equals("33333333333") ||
      this.cpf.equals("44444444444") || this.cpf.equals("55555555555") ||
      this.cpf.equals("66666666666") || this.cpf.equals("77777777777") ||
      this.cpf.equals("88888888888") || this.cpf.equals("99999999999") ||
      (this.cpf.length() != 11))
      return (false);
      
      char dig10, dig11;
      int sm, i, r, num, peso;
      
      // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
      try {
      // Calculo do 1o. Digito Verificador
      sm = 0;
      peso = 10;
      for (i = 0; i < 9; i++) {
      // converte o i-esimo caractere do this.cpf em um numero:
      // por exemplo, transforma o caractere '0' no inteiro 0
      // (48 eh a posicao de '0' na tabela ASCII)
      num = (int) (this.cpf.charAt(i) - 48);
      sm = sm + (num * peso);
      peso = peso - 1;
      }
      
      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
      dig10 = '0';
       else
      dig10 = (char) (r + 48); // converte no respectivo caractere numerico
      
      // Calculo do 2o. Digito Verificador
      sm = 0;
      peso = 11;
      for (i = 0; i < 10; i++) {
      num = (int) (this.cpf.charAt(i) - 48);
      sm = sm + (num * peso);
      peso = peso - 1;
      }
      
      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
      dig11 = '0';
      else
      dig11 = (char) (r + 48);
      
      // Verifica se os digitos calculados conferem com os digitos informados.
      if ((dig10 == this.cpf.charAt(9)) && (dig11 == this.cpf.charAt(10))){
        return (true);
      }
      else {
          return (false);
      }
      } catch (InputMismatchException erro) {
      return (false);
     }
      }
      
      public String imprimeCpf() {
      return (this.cpf.substring(0, 3) + "." + this.cpf.substring(3, 6) + "." +
      this.cpf.substring(6, 9) + "-" + this.cpf.substring(9, 11));
      
     }
     

}
