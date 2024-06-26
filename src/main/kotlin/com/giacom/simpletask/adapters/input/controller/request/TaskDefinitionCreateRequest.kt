package com.giacom.simpletask.adapters.input.controller.request

import jakarta.validation.constraints.NotBlank

data class TaskDefinitionCreateRequest(
    @NotBlank
    val taskName: String,
    @NotBlank
    val taskDescription: String
)
