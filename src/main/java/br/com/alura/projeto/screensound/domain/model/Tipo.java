package br.com.alura.projeto.screensound.domain.model;

public enum Tipo {
  SOLO("solo"),
  DUPLA("dupla"),
  BANDA("banda");

  private String inputString;

  Tipo(String tipo) {
    this.inputString = tipo;
  }

  public static Tipo fromString(String tipoString) {
    for (Tipo tipo : Tipo.values()) {
      if (tipo.inputString.equalsIgnoreCase(tipoString)) {
        return tipo;
      }
    }
    throw new IllegalArgumentException("Tipo inválido! ");
  }
}
