package com.example.mylibrary.componentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.mylibrary.ui.DlsTheme
import com.example.mylibrary.ui.DlsTheme.colors

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colors.background,
            contentColor = colors.primary
        )
    ) {
        Text(
            text = text
        )
    }
}

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = DlsTheme.colors.primary
        ),
        border = BorderStroke(1.dp, colors.primary),

        ) {
        Text(
            text = text
        )
    }
}
