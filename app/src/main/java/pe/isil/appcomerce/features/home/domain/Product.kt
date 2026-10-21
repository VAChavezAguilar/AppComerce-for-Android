package pe.isil.appcomerce.features.home.domain

data class Product(
    val id: Int,
    val nombre: String,
    val marca: String,
    val precio: String,
    val calificacion: Double,
    val descripcion: String,
    val tallasDisponibles: String,
    val imagen: String
)