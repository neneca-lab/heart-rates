package com.example.coracao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.print("Digite o dia de nascimento: ");
        int diaNascimento = scanner.nextInt();

        System.out.print("Digite o mês de nascimento: ");
        int mesNascimento = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        HeartRates paciente = new HeartRates(nome, sobreNome, diaNascimento, mesNascimento, anoNascimento);

        System.out.println("\nInformações do paciente: ");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Sobrenome: " + paciente.getSobrenome());
        System.out.println("Dia de nascimento: " + paciente.getDiaNascimento() + "/" + paciente.getMesNascimento() + "/" + paciente.getAnoNascimento());


        int idade = paciente.calcularIdade();
        System.out.println("Idade: " + idade + " anos");

        int frequenciaCardiacaMax = paciente.frequenciaMaxima();
        System.out.println("Frequencia cardiaca: " + frequenciaCardiacaMax + "bpm");

        String frequenciaCardiacaAlvo = paciente.frequenciaAlvo();
        System.out.println("Frequencia cardiaca alvo: " + frequenciaCardiacaAlvo + "bpm");

        scanner.close();
    }
}