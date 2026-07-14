package br.com.alura.projeto.screensound.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "musicas")
public class Musica {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;

  @ManyToOne
  @JoinColumn(name = "artista_id")
  private Artista artista;

  public Musica() {
  }

  public Musica(Long id, String nome, Artista artista) {
    this.id = id;
    this.nome = nome;
    this.artista = artista;
  }

  public void setArtista(Artista artista) {
    this.artista = artista;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Artista getArtista() {
    return artista;
  }

}
