package _47_Reflection_Class.data

import _47_Reflection_Class.data.annotation.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String
)
