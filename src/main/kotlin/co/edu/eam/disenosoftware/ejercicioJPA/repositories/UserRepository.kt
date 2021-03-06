package co.edu.eam.disenosoftware.ejercicioJPA.repositories

import co.edu.eam.disenosoftware.ejercicioJPA.models.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.persistence.EntityManager
import javax.transaction.Transactional

@Component
@Transactional
class UserRepository {

    @Autowired
    lateinit var em: EntityManager

    fun create(user: User){
        em.persist(user)
    }

    fun find(identification: String): User?{
        return em.find(User::class.java, identification)
    }

    fun update(user: User){
        em.merge(user)
    }

    fun delete(identification: String){
        val usuario = find(identification)
        if (usuario != null){
            em.remove(usuario)
        }

    }
}