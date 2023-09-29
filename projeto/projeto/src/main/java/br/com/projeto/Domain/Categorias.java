package br.com.projeto.Domain;

import java.io.Serializable;

// Serializable pode ser convertido em uma série de bits
public class Categorias implements Serializable {
// Atributos básicos

//Número de versão padrão
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String nome;

    public Categorias(){
        
    }

    // criando o construtor - para chamar a classe
    public Categorias(Integer id, String nome){
        super();
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

// Operações para comparar os objetos por valor
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Categorias other = (Categorias) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


    
    
}
