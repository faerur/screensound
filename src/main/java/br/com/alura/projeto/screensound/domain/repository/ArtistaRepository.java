package br.com.alura.projeto.screensound.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.projeto.screensound.domain.model.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

}
