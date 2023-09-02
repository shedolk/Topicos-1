package br.unitins.topicos1.dto;

public record EstadoResponseDTO  (
    long id;
    String nome;
    String sigla;
){
    public static CadeiraResponseDTO valueOf(Cadeira cadeira){
        return new EstadoResponseDTO(
            estado.getId(),
            estado.getNome(),
            estado.getMaterial();
   ) }
}