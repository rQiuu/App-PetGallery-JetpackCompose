package com.tugas_fe.myapp.petGallery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.tugas_fe.myapp.data.DataPet
import com.tugas_fe.myapp.model.Pet
import com.tugas_fe.myapp.model.PetFashion
import com.tugas_fe.myapp.navigation.Screen
import com.tugas_fe.myapp.petGallery.komponen.PetFashionList
import com.tugas_fe.myapp.petGallery.komponen.PetList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    allFashion: List<PetFashion> = DataPet.FashionPet,
    allPet: List<Pet> = DataPet.petData
) {
    Scaffold(
        topBar = {
            Column {
                TopAppBar(
                    title = { Text(text = "Pet Gallery") }
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(Color.Gray)
                )
            }
        },
    ) { contentPadding ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier.padding(contentPadding)
        ) {

            item {
                ProfileRow(navController, modifier)
            }

            item {
                Text(
                    text = "Pet Fashion",
                    style = MaterialTheme.typography.titleMedium, fontSize = 24.sp,
                    modifier = Modifier.padding(16.dp, 8.dp)
                )
            }

            item {
                LazyRow(
                    contentPadding = PaddingValues(16.dp, 0.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = modifier
                ) {
                    items(allFashion, key = { it.id }) {
                        PetFashionList(fashion = it)
                    }
                }
            }

            item {
                Text(
                    text = "Pet Detail",
                    style = MaterialTheme.typography.titleMedium, fontSize = 24.sp,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }

            items(allPet) {
                PetList(pet = it) { petId ->
                    navController.navigate(Screen.Detail.route + "/$petId")
                }
            }
        }
    }
}
