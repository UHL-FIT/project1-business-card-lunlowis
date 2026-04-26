package com.example.danhthiep

import android.R.attr.lineHeight
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.danhthiep.ui.theme.DanhthiepTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DanhthiepTheme {
                Surface( modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4))
                {
                    Column(modifier = Modifier.fillMaxSize()) {
                        GreetingImage(
                            name = "Danh Thiep",
                            title = "Android Developer",
                            modifier = Modifier.weight(1f)

                        )
                        Greetingtext(
                            number="0934240366",
                            share="@danhthiep",
                            email="hailuan2005@gmail.com",
                            modifier=Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greetingtext(number: String, share: String, email: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 32.dp), // 👈 cách đáy một chút
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp) // 👈 cách đều các dòng
    ){
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "phone",
                tint = Color(0xFF006D3B)
            )
            Text(text = number, fontSize = 18.sp, modifier = Modifier.padding(start = 8.dp))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "share",
                tint = Color(0xFF006D3B)
            )
            Text(text = share, fontSize = 18.sp, modifier = Modifier.padding(start = 8.dp))
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "email",
                tint = Color(0xFF006D3B)
            )
            Text(text = email, fontSize = 18.sp, modifier = Modifier.padding(start = 8.dp))
        }
    }
}
@Composable
fun GreetingImage(name: String, title: String, modifier: Modifier = Modifier) {
    val image=painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFD2E8D4)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(modifier = Modifier
            .background(Color.Black) 
            .padding(16.dp), 
            contentAlignment = Alignment.Center) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.height(116.dp)
            )
        }

        Text(
            text = name,
            fontSize = 32.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = title,
            fontSize = 18.sp,
            color = Color(0xFF006D3B),
            textAlign = TextAlign.Center
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DanhthiepTheme {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            GreetingImage(
                name = "Danh Thiep",
                title = "Android Developer",
                modifier = Modifier.weight(1f)
            )

            Greetingtext(
                number = "0934240366",
                share = "@danhthiep",
                email = "hailuan2005@gmail.com",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}