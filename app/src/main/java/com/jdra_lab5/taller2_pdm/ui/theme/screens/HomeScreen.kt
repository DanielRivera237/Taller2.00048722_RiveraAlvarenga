package com.jdra_lab5.taller2_pdm.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jdra_lab5.taller2_pdm.data.DummyData
import com.jdra_lab5.taller2_pdm.model.Restaurant
import com.jdra_lab5.taller2_pdm.navigation.Screen

@Composable
fun HomeScreen(navController: NavController) {
    val grouped = remember {
        DummyData.restaurants
            .filterNotNull()
            .groupBy { it.category.trim() }
    }

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        grouped.forEach { (category, restaurants) ->
            item {
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(16.dp)
                )
                LazyRow(modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)) {
                    items(restaurants) { restaurant ->
                        RestaurantCard(restaurant = restaurant) {
                            navController.navigate(Screen.Menu.createRoute(restaurant.name.trim()))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: () -> Unit) {
    val context = LocalContext.current
    val resId = context.resources.getIdentifier(restaurant.imageUrl, "drawable", context.packageName)

    Card(
        modifier = Modifier
            .padding(end = 16.dp)
            .width(160.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (resId != 0) {
                Image(
                    painter = painterResource(id = resId),
                    contentDescription = restaurant.name,
                    modifier = Modifier
                        .height(100.dp)
                        .fillMaxWidth()
                )
            }
            Spacer(Modifier.height(8.dp))
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }
    }
}
