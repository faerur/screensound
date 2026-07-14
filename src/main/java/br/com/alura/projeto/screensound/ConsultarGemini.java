package br.com.alura.projeto.screensound;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultarGemini {
  public static String obterInformacoesArtista(String texto) {
    Client client = Client.builder().apiKey(System.getenv("API_KEY")).build();

    GenerateContentResponse response = client.models.generateContent(
        "gemini-3-flash-preview",
        "Faça um pequeno resumo de uma linha sobre o seguinte artista, não pergunte mais nada, apenas faça: "
            + texto,
        null);

    return response.text();
  }
}
