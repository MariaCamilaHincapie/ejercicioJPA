package co.edu.eam.disenosoftware.ejercicioJPA

import co.edu.eam.disenosoftware.ejercicioJPA.models.User
import co.edu.eam.disenosoftware.ejercicioJPA.repositories.UserRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class EjercicioJpaApplicationTests {

	@Autowired
	lateinit var userRepository: UserRepository

	@Test
	fun contextLoads() {
	}

	@Test
	fun textCreate(){
		userRepository.create(User(identification = "1", name = "Camila", lastName = "Hincapie"))
	}

	@Test
	fun textFind(){
		val user = userRepository.find(identification = "2")
		println(user)
	}

	@Test
	fun testUpdate(){
		val user = userRepository.find(identification = "1")
		user?.name = "Maria"
		if (user != null){
			userRepository.update(user)
		}else{
			print("No existe la persona")
		}
	}

	@Test
	fun testDelete (){
		userRepository.delete(identification = "1")
	}

}
