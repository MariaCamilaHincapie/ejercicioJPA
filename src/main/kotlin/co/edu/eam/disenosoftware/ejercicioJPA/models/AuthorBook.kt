package co.edu.eam.disenosoftware.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "libro_autor")
data class AuthorBook (
    @Id
    //@Column(name = "id")
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "id_autor")
    var author: Author,

    @ManyToOne
    @JoinColumn(name = "id_libro")
    var book: Book,
):Serializable