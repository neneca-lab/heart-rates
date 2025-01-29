package com.example.coracao;
import java.time.LocalDate;
import java.time.Period;


public class HeartRates extends Paciente{
    private String nome;
    private String sobreNome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public HeartRates(String nome, String sobreNome, int diaNascimento, int mesNascimento, int anoNascimento) {
        super(nome, sobreNome, diaNascimento, mesNascimento, anoNascimento);
    }

    public int calcularIdade(){
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, mesNascimento);
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }

    public int frequenciaMaxima(){
        return 220 - calcularIdade();
    }

    public String frequenciaAlvo(){
        int frequneciaMaxima = frequenciaMaxima();
        int frequenciaAlvoMinima = (int) (frequneciaMaxima * 0.5);
        int frequenciaAlvoMaxima = (int) (frequneciaMaxima * 0.85);

        return frequenciaAlvoMinima + " - " + frequenciaAlvoMaxima;
    }

}
