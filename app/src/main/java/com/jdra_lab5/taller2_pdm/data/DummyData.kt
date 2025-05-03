// DummyData.kt actualizado: corregido postre cheesecake en lugar de torta
package com.jdra_lab5.taller2_pdm.data

import com.jdra_lab5.taller2_pdm.model.Dish
import com.jdra_lab5.taller2_pdm.model.Restaurant

object DummyData {
    val restaurants = listOf(
        Restaurant(
            name = "KFC",
            description = "Pollo frito y crujiente",
            imageUrl = "kfc",
            category = "Comida Rápida",
            menu = listOf(
                Dish("Bucket Familiar", "Porción familiar de pollo", "pollo"),
                Dish("Papas Cajún", "Papas con especias", "fries")
            )
        ),
        Restaurant(
            name = "McDonald's",
            description = "Clásica comida rápida",
            imageUrl = "mcdonalds",
            category = "Comida Rápida",
            menu = listOf(
                Dish("Big Mac", "Hamburguesa doble con queso", "burger"),
                Dish("Papas Fritas", "Delgadas y crocantes", "fries")
            )
        ),
        Restaurant(
            name = "Wendy's",
            description = "Comida rápida americana",
            imageUrl = "wendys",
            category = "Comida Rápida",
            menu = listOf(
                Dish("Doble Cheeseburger", "Con queso americano y pepinillos", "burger"),
                Dish("Combo Classic", "Hamburguesa con papas y bebida", "fries")
            )
        ),
        Restaurant(
            name = "Panchitos",
            description = "Tacos, enchiladas y más",
            imageUrl = "panchitos",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Taco al Pastor", "Carne marinada con piña", "tacos"),
                Dish("Nachos", "Con queso derretido y jalapeños", "nachos")
            )
        ),
        Restaurant(
            name = "Zócalo",
            description = "Comida típica mexicana",
            imageUrl = "zocalo",
            category = "Comida Mexicana",
            menu = listOf(
                Dish("Burrito de Res", "Con frijoles, queso y carne", "burrito"),
                Dish("Burrito Veggie", "Con arroz integral y verduras", "burrito")
            )
        ),
        Restaurant(
            name = "Lucca",
            description = "Auténtica pizza italiana",
            imageUrl = "lucca",
            category = "Comida Italiana",
            menu = listOf(
                Dish("Pizza Margarita", "Clásica con albahaca", "pizza"),
                Dish("Lasaña", "Con carne y queso ricotta", "lasana")
            )
        ),
        Restaurant(
            name = "Pastaria",
            description = "Comida italiana gourmet",
            imageUrl = "pastaria",
            category = "Comida Italiana",
            menu = listOf(
                Dish("Risotto de Hongos", "Arroz cremoso con champiñones", "risoto"),
                Dish("Pasta Alfredo", "Con crema y parmesano", "espagueti")
            )
        ),
        Restaurant(
            name = "Asia Wok",
            description = "Sabores del oriente",
            imageUrl = "asian",
            category = "Comida Asiática",
            menu = listOf(
                Dish("Sushi", "Fresco y variado", "tempura"),
                Dish("Ramen", "Con caldo de cerdo", "padthai")
            )
        ),
        Restaurant(
            name = "China Wok",
            description = "Comida china rápida",
            imageUrl = "chinawok",
            category = "Comida Asiática",
            menu = listOf(
                Dish("Pollo agridulce", "Con piña y vegetales", "pollo"),
                Dish("Arroz frito", "Con huevo y jamón", "padthai")
            )
        ),
        Restaurant(
            name = "Max Green",
            description = "Opciones veganas y frescas",
            imageUrl = "maxgreen",
            category = "Comida Saludable",
            menu = listOf(
                Dish("Wrap Vegano", "Con hummus y vegetales", "healthy"),
                Dish("Ensalada Detox", "Con espinaca y quinoa", "healthy")
            )
        ),
        Restaurant(
            name = "Dulce Tentación",
            description = "Postres irresistibles",
            imageUrl = "desserts",
            category = "Postres y Dulces",
            menu = listOf(
                Dish("Cheesecake", "Con frutos rojos", "cheesecake"),
                Dish("Tartaletas", "De crema pastelera", "tartaletas")
            )
        ),
        Restaurant(
            name = "Desserts Island",
            description = "Postres gourmet y repostería",
            imageUrl = "dessetrsisland",
            category = "Postres y Dulces",
            menu = listOf(
                Dish("Tiramisú", "Postre italiano con café", "tartaletas"),
                Dish("Cheesecake", "Con frutos rojos", "cheesecake")
            )
        ),
        Restaurant(
            name = "Juice Bar",
            description = "Jugos y bebidas naturales",
            imageUrl = "juicebar",
            category = "Bebidas",
            menu = listOf(
                Dish("Smoothie Tropical", "Piña, mango y coco", "limofresa"),
                Dish("Piña Colada", "Con leche de coco", "pinacolada")
            )
        ),
        Restaurant(
            name = "Macondo",
            description = "Cafés, jugos y batidos",
            imageUrl = "macondo",
            category = "Bebidas",
            menu = listOf(
                Dish("Mojito de Mango", "Con hierbabuena y hielo", "drinks"),
                Dish("Latte Frío", "Café con leche helado", "drinks")
            )
        )
    )
}