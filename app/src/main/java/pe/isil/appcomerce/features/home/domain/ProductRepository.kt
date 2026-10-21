package pe.isil.appcomerce.features.home.domain

interface ProductRepository {

    fun getProducts(): List<Product>
}