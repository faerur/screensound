package br.com.alura.projeto.screensound.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.projeto.screensound.domain.model.Artista;
import br.com.alura.projeto.screensound.domain.model.Musica;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

  Optional<Artista> findByNome(String nome);

  @Query("SELECT m FROM Artista a JOIN a.musicas m WHERE a.nome = :nome")
  List<Musica> consultarMusicasPorArtista(String nome);
}
