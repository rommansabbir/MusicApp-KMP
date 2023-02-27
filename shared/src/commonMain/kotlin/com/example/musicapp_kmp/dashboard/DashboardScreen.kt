package com.example.musicapp_kmp.dashboard

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.seiko.imageloader.rememberAsyncImagePainter


/**
 * Created by abdulbasit on 26/02/2023.
 */

@Composable
internal fun DashboardScreen(viewModel: DashboardViewModel) {
    val state = viewModel.dashboardState.collectAsState()
    DashboardView()
}

@Composable
internal fun DashboardView() {
    val listState = rememberScrollState()
    Column(modifier = Modifier.background(color = Color(0xFF1D2123)).fillMaxSize().verticalScroll(listState)) {
        TopChartView()
        TopCarts()
        NewReleases()
    }
}

@Composable
internal fun TopChartView() {
    Box(
        modifier = Modifier.aspectRatio(ratio = (367.0 / 450.0).toFloat()).clip(RoundedCornerShape(20.dp))
            .padding(16.dp)
    ) {
        val painter =
            rememberAsyncImagePainter("https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg")
        Image(
            painter,
            "https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg",
            modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(20.dp)),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.padding(16.dp).align(Alignment.BottomStart)) {
            Text(
                "R & B Hits",
                style = MaterialTheme.typography.h4.copy(fontWeight = FontWeight.Bold),
                color = Color.White
            )
            Text(
                "ll mine, Lie again, Petty call me everyday,\n" + "Out of time, No love, Bad habit,\n" + "and so much more",
                style = MaterialTheme.typography.body2,
                color = Color.White,
                modifier = Modifier.padding(top = 6.dp)
            )
            Row(modifier = Modifier.padding(top = 40.dp)) {
                Icon(
                    imageVector = Icons.Filled.CheckCircle,
                    tint = Color.White,
                    contentDescription = "Explore details",
                    modifier = Modifier.size(30.dp).align(Alignment.Top)
                )
                Text(
                    text = "33k Likes",
                    style = MaterialTheme.typography.h5,
                    color = Color.White,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}

@Composable
internal fun TopCarts() {
    Column(modifier = Modifier.padding(top = 46.dp)) {
        Text(
            "Top charts",
            style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Bold, color = Color(0xFFEFEEE0)),
            modifier = Modifier.padding(start = 16.dp)
        )
        val listState = rememberLazyListState()

        LazyRow(
            modifier = Modifier.padding(top = 16.dp).fillMaxSize(),
            state = listState,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(items = listOf(1, 2)) {
                Box(
                    modifier = Modifier.width(232.dp).clip(RoundedCornerShape(20.dp))
                        .background(Color(0xFF1A1E1F))
                ) {

                    Column(modifier = Modifier.padding(16.dp)) {
                        val painter =
                            rememberAsyncImagePainter("https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg")
                        Image(
                            painter,
                            "https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg",
                            modifier = Modifier.clip(RoundedCornerShape(20.dp)).width(100.dp).height(100.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Golden age of 80s",
                            style = MaterialTheme.typography.body1.copy(color = Color.White),
                            modifier = Modifier.padding(top = 16.dp)
                        )
                        Text(
                            text = "Golden age of 80s",
                            style = MaterialTheme.typography.caption.copy(color = Color.White.copy(alpha = 0.5f)),
                            modifier = Modifier.padding(top = 8.dp)
                        )
                        Text(
                            text = "Golden age of 80s",
                            style = MaterialTheme.typography.body2.copy(color = Color.White),
                            modifier = Modifier.padding(top = 24.dp)
                        )
                    }
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        tint = Color(0xFFFACD66),
                        contentDescription = "Explore details",
                        modifier = Modifier.padding(top = 16.dp, end = 16.dp).size(30.dp).align(Alignment.TopEnd)
                    )
                }
            }
        }
    }
}

@Composable
internal fun NewReleases() {
    Column(modifier = Modifier.padding(top = 46.dp)) {
        Text(
            "New releases",
            style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Bold, color = Color(0xFFEFEEE0)),
            modifier = Modifier.padding(start = 16.dp)
        )
        val listState = rememberLazyListState()

        LazyRow(
            modifier = Modifier.padding(top = 16.dp).fillMaxSize(),
            state = listState,
            horizontalArrangement = Arrangement.spacedBy(30.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(items = listOf(1, 2)) {
                Box {
                    Column {
                        val painter =
                            rememberAsyncImagePainter("https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg")
                        Image(
                            painter,
                            "https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg",
                            modifier = Modifier.clip(RoundedCornerShape(20.dp)).width(153.dp).height(153.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = "Life in a bubble",
                            style = MaterialTheme.typography.caption.copy(color = Color.White),
                            modifier = Modifier.padding(top = 16.dp)
                        )
                        Text(
                            text = "Golden age of 80s",
                            style = MaterialTheme.typography.caption.copy(color = Color.White.copy(alpha = 0.5f)),
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                }
            }
        }
    }
}
