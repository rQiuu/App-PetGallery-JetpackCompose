package com.tugas_fe.myapp.petGallery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.tugas_fe.myapp.data.DataPet
import com.tugas_fe.myapp.model.Pet


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailPetScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    idPets: Int?
) {
    val petList = DataPet.petData.filter {
        pet -> pet.id == idPets
    }
    Scaffold(
        topBar = {
            Column {
                TopAppBar(
                    title = { Text(text = "Pet Detail") },
                    navigationIcon = {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                        }
                    }
                )
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(Color.Gray)
                )
            }
        }
    ) {
        DetailPetContent(petList = petList, modifier = modifier.padding(it))
    }
}

@Composable
private fun DetailPetContent(
    petList: List<Pet>,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(10.dp, shape = RoundedCornerShape(16.dp))
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(data = petList[0].photo)
                        .build(),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(height = 250.dp, width = 170.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    contentDescription = "Pet Image"
                )
            }
            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Text(
                    text = petList[0].nickname,
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 30.sp,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Age: ${petList[0].age}",
                    style = MaterialTheme.typography.bodySmall,
                    fontSize = 15.sp,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Detail",
            color = Color(0xFF4CAF50),
            style = MaterialTheme.typography.titleMedium,
            fontSize = 24.sp,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = petList[0].detail,
            style = MaterialTheme.typography.titleMedium,
            fontSize = 16.sp,
            overflow = TextOverflow.Ellipsis
        )
    }
}
@Preview(showBackground = true)
@Composable
private fun DetailPetContentPreview() {
    DetailPetContent(petList = DataPet.petData)
}