package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados 
{
    private Set<Convidado>  convidadoSet;

    public ConjuntoConvidados()
    {
        this.convidadoSet = new HashSet<>();  
    }
    public void adicionarConvidados(String nome, int codigoConvite)
    {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite)
    {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet)
        {
            if(c.getCodigoConvite() == codigoConvite)
            {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados()
    {
        return convidadoSet.size();
    }

    public void exibirConvidados()
    {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    
        // Exibindo o número de convidados no conjunto (deve ser zero)
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
    
        // Adicionando convidados ao conjunto
        conjuntoConvidados.adicionarConvidados("Alice", 1234);
        conjuntoConvidados.adicionarConvidados("Bob", 1235);
        conjuntoConvidados.adicionarConvidados("Charlie", 1235);
        conjuntoConvidados.adicionarConvidados("David", 1236);
    
        // Exibindo os convidados no conjunto
        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();
    
        // Exibindo o número atualizado de convidados no conjunto
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
    
        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");
    
        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
      }
}
