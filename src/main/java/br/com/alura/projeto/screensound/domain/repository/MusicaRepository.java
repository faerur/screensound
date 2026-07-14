package br.com.alura.projeto.screensound.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.projeto.screensound.domain.model.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long> {

}
