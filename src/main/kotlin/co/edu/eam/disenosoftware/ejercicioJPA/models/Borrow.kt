package co.edu.eam.disenosoftware.ejercicioJPA.models

import java.util.*
import javax.persistence.*

@Table(name = "prestamo")
data class Borrow (
    @Id
    @Column(name = "id")
    val id: Long,

    @Column(name = "fecha_prestamo")
    var dateTime: Date,

    @ManyToOne
    @JoinColumn(name = "id_libro")
    var book: Book,

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    var user: User,
)