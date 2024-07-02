package br.com.deusefiel.filmesESeries.service;

public interface IconverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
