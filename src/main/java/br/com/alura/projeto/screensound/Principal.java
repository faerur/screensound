package br.com.alura.projeto.screensound;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import br.com.alura.projeto.screensound.domain.model.Artista;
import br.com.alura.projeto.screensound.domain.model.Tipo;
import br.com.alura.projeto.screensound.domain.repository.ArtistaRepository;
import br.com.alura.projeto.screensound.domain.repository.MusicaRepository;

@Component
public class Principal {
  private Scanner scanner = new Scanner(System.in);

  private final ArtistaRepository artistaRepository;
  private final MusicaRepository musicaRepository;

  public Principal(ArtistaRepository artistaRepository, MusicaRepository musicaRepository) {
    this.artistaRepository = artistaRepository;
    this.musicaRepository = musicaRepository;
  }

  public void principal() {
    boolean consultarBanco = true;
    var opcao = 0;
    while (consultarBanco) {
      System.out.println("***Screen Sound Músicas ***");
      System.out.println("""
          1 - Cadastrar artistas
          2 - Cadastrar músicas
          3 - Listar músicas
          4 - Buscar músicas por artistas
          5 - Pesquisar dados sobre um artista

          9 - Sair
          """);
      opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          cadastrarArtistas();
          break;
        case 2:
          cadastrarMusica();
          break;
        case 3:
          listarMusicas();
          break;
        case 4:
          buscarMusicasPorArtistas();
          break;
        case 5:
          pesquisarDadosSobreUmArtista();
          break;
        case 9:
          scanner.close();
          consultarBanco = false;
          break;
      }
    }
  }

  private void pesquisarDadosSobreUmArtista() {
    String artista = scanner.nextLine();
    System.out.println(ConsultarGemini.obterInformacoesArtista(artista));

  }

  private void buscarMusicasPorArtistas() {

  }

  private void listarMusicas() {
    musicaRepository.findAll().forEach(m -> System.out.println("Música: " + m.getNome()));
  }

  private void cadastrarMusica() {

  }

  private void cadastrarArtistas() {
    String continua = "";
    while (!continua.equalsIgnoreCase("n")) {
      System.out.println("Informe o nome do artista: ");
      scanner.nextLine();
      String nome = scanner.nextLine();
      System.out.println("Informe o tipo desse artista: ");
      String tipoString = scanner.nextLine();
      Tipo tipo = Tipo.fromString(tipoString);
      Artista artista = new Artista(nome, tipo);
      artistaRepository.save(artista);
      System.out.println("Deseja cadastrar outro artista? (S/N)");
      continua = scanner.nextLine();
    }
  }
}
