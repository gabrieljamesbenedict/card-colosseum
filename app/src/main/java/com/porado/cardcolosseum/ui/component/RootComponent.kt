package com.porado.cardcolosseum.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp

@Preview
@Composable
fun RootComponent() {
    Box (
        modifier = Modifier.padding(top = Dp(24f))
    ) {
        Text(
            text = "HelloWorld"
        )
    }
}