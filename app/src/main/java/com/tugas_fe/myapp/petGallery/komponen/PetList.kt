package com.tugas_fe.myapp.petGallery.komponen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tugas_fe.myapp.R
import com.tugas_fe.myapp.model.Pet

@Composable
fun PetList(
    pet: Pet,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Card(
        modifier = modifier
            .padding(16.dp, 0.dp)
            .clickable { onItemClicked(pet.id) }
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = pet.photo),
                contentDescription = pet.nickname,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp,4.dp)
            ) {
                Text(
                    text = pet.nickname,
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 28.sp,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = pet.age,
                    style = MaterialTheme.typography.bodySmall,
                    fontSize = 18.sp,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ListPetPreview() {
    PetList(
        pet = Pet(1, "", "Kitty", R.drawable.c1, "1tahun", ""),
        onItemClicked = { petId ->
            println("pet Id : $petId")
        }
    )
}