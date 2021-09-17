package co.edu.eam.disenosoftware.ejercicioJPA.models

import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "usuario")
data class User (

    @Id
    @Column(name = "user_identification")
    val identification: String,

    @Column(name = "nombre_usuario")
    var name: String,

    @Column(name = "aoellido_usuario")
    var lastName: String,
)