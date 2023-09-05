package br.unitins.topicos1.dto;

public class CadeiraDTO {
    private final String nome;
    private final String material;
    private final String modelo;

    public CadeiraDTO(String nome, String material, String modelo) {
        this.nome = nome;
        this.material = material;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public String getModelo() {
        return modelo;
    }


}



    



