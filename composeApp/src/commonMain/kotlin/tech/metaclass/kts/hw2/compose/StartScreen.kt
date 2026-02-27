package tech.metaclass.kts.hw2.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import hw2_multiplatform.composeapp.generated.resources.Res
import hw2_multiplatform.composeapp.generated.resources.compose_multiplatform
import hw2_multiplatform.composeapp.generated.resources.go_button
import hw2_multiplatform.composeapp.generated.resources.image_description
import hw2_multiplatform.composeapp.generated.resources.welcome_text
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import tech.metaclass.kts.hw2.utils.Dimens

@Composable
fun StartScreen(
    onButtonClick: () -> Unit
) {
    MaterialTheme {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .fillMaxSize()
                .padding(Dimens.gapMedium),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AsyncImage(
                model = "https://cataas.com/cat/cute?width=400&height=400",
                contentDescription = stringResource(Res.string.image_description),
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(10)),
                contentScale = ContentScale.Crop,
                placeholder = painterResource(Res.drawable.compose_multiplatform)
            )
            Spacer(modifier = Modifier.height(Dimens.gapLarge))
            Text(
                stringResource(Res.string.welcome_text),
                fontSize = Dimens.fontLarge,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(Dimens.gapLarge))
            Button(
                onClick = onButtonClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    stringResource(Res.string.go_button),
                    fontSize = Dimens.fontMedium
                )
            }
        }
    }
}

@Composable
@Preview
private fun StartScreenPreview() {
    StartScreen {}
}
