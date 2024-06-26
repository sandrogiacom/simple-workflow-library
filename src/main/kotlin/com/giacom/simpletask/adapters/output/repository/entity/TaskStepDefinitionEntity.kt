package com.giacom.simpletask.adapters.output.repository.entity

import jakarta.persistence.*

@Entity
@Table(name = "task_step_definition")
data class TaskStepDefinitionEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val stepName: String,
    val stepDescription: String,
    @ManyToOne
    @JoinColumn(name = "task_definition_id")
    val taskDefinition: TaskDefinitionEntity,
    val stepHandler: String? = null
)
