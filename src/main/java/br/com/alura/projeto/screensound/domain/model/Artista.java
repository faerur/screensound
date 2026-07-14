package br.com.alura.projeto.screensound.domain.model;

import java.util.List;

import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Artista {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @Enumerated
  private Tipo tipo;
  private List<Musica> musicas;

  public Artista() {
  }

  public Artista(Long id, String nome, Tipo tipo, List<Musica> musicas) {
    this.id = id;
    this.nome = nome;
    this.tipo = tipo;
    this.musicas = musicas;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Tipo getTipo() {
    return tipo;
  }

  public void setTipo(Tipo tipo) {
    this.tipo = tipo;
  }

  public List<Musica> getMusicas() {
    return musicas;
  }

  public void setMusicas(List<Musica> musicas) {
    this.musicas = musicas;
  }

}
