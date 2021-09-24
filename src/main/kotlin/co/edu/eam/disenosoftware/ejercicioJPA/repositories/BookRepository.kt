package co.edu.eam.disenosoftware.ejercicioJPA.repositories

import co.edu.eam.disenosoftware.ejercicioJPA.models.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager
import javax.transaction.Transactional

@Component
@Transactional
class BookRepository {
    @Autowired
    lateinit var em: EntityManager

    fun create(book: Book){
        em.persist(book)
    }

    fun find(code: String): Book?{
        return em.find(Book::class.java, code)
    }

    fun update(Book: Book){
        em.merge(Book)
    }

    fun delete(code: String){
        val book = find(code)
        if (book != null){
            em.remove(book)
        }

    }
}