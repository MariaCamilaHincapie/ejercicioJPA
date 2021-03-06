package co.edu.eam.disenosoftware.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "autor")
data class Author (
    @Id
    @Column(name = "codigo_autor")
    val id: Long,

    @Column(name = "nombre")
    var name: String,

    @Column(name = "apellido")
    var lastName: String,
):Serializable