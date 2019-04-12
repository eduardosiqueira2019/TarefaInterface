package br.com.digitalhouse;

public class Subtracao implements OperacaoMatematica {
    @Override
    public int calcula(int a, int b) {
        return a-b;
    }
}
