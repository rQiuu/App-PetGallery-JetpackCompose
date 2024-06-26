package com.tugas_fe.myapp.petGallery

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.tugas_fe.myapp.R
import com.tugas_fe.myapp.data.DataKu
import com.tugas_fe.myapp.navigation.Screen

@Composable
fun ProfileRow(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val profil = DataKu.myProfil

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp, 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = profil.photo),
            contentDescription = "Profil Photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .clickable {
                    navController.navigate(Screen.Profil.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                    }
                },
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = DataKu.myProfil.nama,
            style = MaterialTheme.typography.titleMedium, fontSize = 20.sp,
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = stringResource(id = R.string.menu_favorite),
            modifier = Modifier
                .size(32.dp)
                .clickable {
                    navController.navigate(Screen.Favorite.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                    }
                }
        )
    }
}