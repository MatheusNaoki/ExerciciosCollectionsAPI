package Set.Pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int numero;

    public Contato(String nome, int numero)
    {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(getNome());
    }

    @Override
    public boolean equals(Object obj) 
    {
        if(this == obj)
        {
            return true;
        }
        if (!(obj instanceof Contato contato))
        {
            return false;
        }
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", numero=" + numero + "]\n";
    }
}
