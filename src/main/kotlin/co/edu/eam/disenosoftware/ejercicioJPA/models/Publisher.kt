package co.edu.eam.disenosoftware.ejercicioJPA.models

import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "editorial")
data class Publisher (
    @Id
    @Column(name = "codigo_editorial")
    val code: String,

    @Column(name = "nombre_editorial")
    var name: String,
)