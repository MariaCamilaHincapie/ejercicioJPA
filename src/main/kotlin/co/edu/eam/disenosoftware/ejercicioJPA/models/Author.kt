package co.edu.eam.disenosoftware.ejercicioJPA.models

import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "autor")
data class Author (
    @Id
    @Column(name = "codigo_autor")
    val id: Long,

    @Column(name = "nombre")
    var name: String,

    @Column(name = "apellido")
    var lastName: String,
)