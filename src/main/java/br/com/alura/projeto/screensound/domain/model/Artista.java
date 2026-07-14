package br.com.alura.projeto.screensound.domain.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "artistas")
public class Artista {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;

  @Enumerated(EnumType.STRING)
  private Tipo tipo;

  @OneToMany(mappedBy = "artista")
  private List<Musica> musicas;

  public Artista() {
  }

  public Artista(String nome, Tipo tipo) {
    this.nome = nome;
    this.tipo = tipo;
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
