package dominio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        /* 
        Exemplo para instanciar classes em caso de inserção de dados;
        Pessoa p1 = new Pessoa(null, "Maria dos Santos", "maria@gmail.com");
        Pessoa p2 = new Pessoa(null, "Heliezer Garcia Gonçalves", "helie@gmail.com");
        Pessoa p3 = new Pessoa(null, "Santos Dumont", "dumont@gmail.com"); */

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

       /*  Para inserir os dados utilize as linhas abaixo 

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit(); 

        */

        // Exemplo para buscar dados pelo ID;
        Pessoa p = em.find(Pessoa.class, 8);


        System.out.println(p);
        
        

        System.out.println("Insert Data OK");
        emf.close();
        em.close();

        
    }
}
