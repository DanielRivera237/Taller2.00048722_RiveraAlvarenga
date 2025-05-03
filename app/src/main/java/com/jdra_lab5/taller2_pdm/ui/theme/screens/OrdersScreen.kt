package com.jdra_lab5.taller2_pdm.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jdra_lab5.taller2_pdm.model.Dish

val cartItems: MutableList<Dish> = mutableStateListOf()

@Composable
fun OrdersScreen() {
    val context = LocalContext.current

    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Carrito de Compras",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        if (cartItems.isEmpty()) {
            Text("No hay elementos en el carrito")
        } else {
            LazyColumn {
                items(cartItems) { dish ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(8.dp)
                        ) {
                            val resId = context.resources.getIdentifier(
                                dish.imageUrl,
                                "drawable",
                                context.packageName
                            )

                            if (resId != 0) {
                                Image(
                                    painter = painterResource(id = resId),
                                    contentDescription = dish.name,
                                    modifier = Modifier
                                        .size(60.dp)
                                        .padding(end = 8.dp)
                                )
                            }

                            Column {
                                Text(text = dish.name, style = MaterialTheme.typography.bodyLarge)
                                Text(text = dish.description, style = MaterialTheme.typography.bodySmall)
                            }
                        }
                    }
                }
            }
        }
    }
}
