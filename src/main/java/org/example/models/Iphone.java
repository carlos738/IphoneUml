package org.example.models;


import org.example.interfaces.AparelhoTelefonico;
import org.example.interfaces.NavegadorDeInternet;
import org.example.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {

    @Override
    public void ligarTelefone() {
        System.out.println("LIGANDO O TELEFONE. ");
    }

    @Override
    public void atenderTelefone() {
        System.out.println("ATENDENDO O TELEFONE. ");

    }

    @Override
    public void iniiciarCorreioDeVoz() {
        System.out.println("INICIANDO O CORREIO DE VOZ.");

    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA DA WEB.");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA.");

    }

    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MÚSICA.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("MÚSICA PAUSADA.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONAR PRÓXIMA MÚSICA...");
    }
}
