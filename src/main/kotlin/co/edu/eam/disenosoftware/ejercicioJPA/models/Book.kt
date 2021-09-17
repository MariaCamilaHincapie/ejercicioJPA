package co.edu.eam.disenosoftware.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "libro")
data class Book (
    @Id
    @Column(name = "codigo_libro")
    val code: String,

    @Column(name = "nombre_libro")
    var name: String,

    @OneToMany
    var authors: List<AuthorBook>,

    @ManyToOne
    @JoinColumn(name = "id_editorial")
    var publisher: Publisher,
):Serializable