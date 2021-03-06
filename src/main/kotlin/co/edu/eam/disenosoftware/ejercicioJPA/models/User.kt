package co.edu.eam.disenosoftware.ejercicioJPA.models

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "usuario")
data class User (

    @Id
    @Column(name = "user_identification")
    val identification: String,

    @Column(name = "nombre_usuario")
    var name: String,

    @Column(name = "apellido_usuario")
    var lastName: String,
):Serializable