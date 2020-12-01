package com.codelab.layouts

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.codelab.layouts.ui.LayoutsCodelabTheme

@ExperimentalLayout
@Composable
fun TwoTexts(modifier: Modifier = Modifier, text1: String, text2: String) {
    Row(modifier = modifier.preferredHeight(IntrinsicSize.Min)) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.Start),
            text = text1
        )

        Divider(color = Color.Black, modifier = Modifier.fillMaxHeight().preferredWidth(1.dp))
        Text(
            modifier = Modifier
                .weight(1f)

                .padding(end = 4.dp)
                .wrapContentWidth(Alignment.End),
            text = text2
        )
    }
}

@ExperimentalLayout
@Preview
@Composable
fun TwoTextsPreview() {
    LayoutsCodelabTheme {
        Surface {
            TwoTexts(text1 = "Hi", text2 = "there")
        }
    }
}