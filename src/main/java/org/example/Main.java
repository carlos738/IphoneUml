package org.example;

import org.example.models.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        // testando os métodos do AparelhoTelefonico

        iphone.ligarTelefone();
        iphone.atenderTelefone();
        iphone.iniiciarCorreioDeVoz();

        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        // testando os métodos de NavegadorDeInternet

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
