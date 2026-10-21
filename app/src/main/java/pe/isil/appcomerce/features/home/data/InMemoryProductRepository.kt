package pe.isil.appcomerce.features.home.data

import pe.isil.appcomerce.features.home.domain.Product
import pe.isil.appcomerce.features.home.domain.ProductRepository

class InMemoryProductRepository : ProductRepository {

    override fun getProducts(): List<Product> {
        return listOf(
            Product(
                id = 1,
                nombre = "Nike Air Motion",
                marca = "Nike",
                precio = "$ 459.90",
                calificacion = 4.9,
                descripcion = "Modelo deportivo con tecnología Air para máxima amortiguación.",
                tallasDisponibles = "40, 41, 42, 43",
                imagen = "https://i.imgur.com/E8ZBAnC.png"
            ),
            Product(
                id = 2,
                nombre = "ASICS Velocity Pro",
                marca = "ASICS",
                precio = "$ 399.90",
                calificacion = 4.8,
                descripcion = "Zapatilla cómoda para entrenamiento diario con gran amortiguación.",
                tallasDisponibles = "39, 40, 41, 42, 43",
                imagen = "https://i.imgur.com/Uh1Jye7.png"
            ),
            Product(
                id = 3,
                nombre = "Adidas RunBoost X",
                marca = "Adidas",
                precio = "$ 349.90",
                calificacion = 4.6,
                descripcion = "Zapatilla ligera y flexible ideal para entrenamiento urbano.",
                tallasDisponibles = "39, 40, 41, 42",
                imagen = "https://i.imgur.com/1yfHnqw.png"
            )
        )
    }
}