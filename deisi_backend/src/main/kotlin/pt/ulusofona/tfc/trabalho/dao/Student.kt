package pt.ulusofona.tfc.trabalho.dao

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Student (
        @Id @GeneratedValue
        val id: Long = 0,
        var name: String,
        var age: Int,
        var imgSrc: String,
        @Column(length = 300)
        var description: String)
