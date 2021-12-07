package control;

import java.util.List;
import model.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class PessoaControle {
	private EntityManager em;

	public PessoaControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos_bd");
		em = emf.createEntityManager();
	}



	public void inserir(Pessoa obj) {
		   try {
	            em.getTransaction().begin();
	            em.persist(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

	}

	public void alterar(Pessoa obj) {
		   try {
	            em.getTransaction().begin();
	            em.merge(obj);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }

	}

	public void excluir(Pessoa obj) {
		try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }

	}

	public void excluirPorId(Integer id) {
		 try {
	           Pessoa obj = buscarPorId(id);
	            excluir(obj);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }
	}

	public Pessoa buscarPorId(Integer id) {
		return em.find(Pessoa.class, id);
	}

	public List<Pessoa> buscarTodos() {
		String nomeClasse = Pessoa.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}
}
