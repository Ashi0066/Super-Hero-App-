package com.example.superheroapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.superheroapp.model.Hero
import java.nio.file.WatchEvent



@Composable
fun HeroListitem(
    heroes: List<Hero>,
    modifier: Modifier= Modifier,
    contentPadding:PaddingValues= PaddingValues(0.dp),
)
{
    LazyColumn(contentPadding =contentPadding  )
    {
        itemsIndexed(heroes){index,hero->heroList(
            hero = hero,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp))}
    }
}


@Composable
fun heroList(
    hero: Hero,
    modifier: Modifier=Modifier
){
    Card (
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier,
        )
    {
        Row (modifier= Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .sizeIn(minHeight = 72.dp)
        ){

            Column (modifier=Modifier.weight(1f)){
                Text(
                    text = stringResource(id = hero.heroNameId,),
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    text = stringResource(id = hero.heroDesID),
                    style = MaterialTheme.typography.bodyLarge,
                    )
            }
            Spacer(Modifier.width(16.dp))
            Box(
                modifier = Modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(8.dp))){
                Image(painter = painterResource( hero.herImageId),
                    contentDescription =null,
                    alignment= Alignment.TopCenter,
                    contentScale = ContentScale.FillWidth
                )
            }

        }

    }
}
@Preview
@Composable
fun previewApp(){
    heroList(hero =Hero(R.string.hero1,R.string.hero1,R.drawable.android_superhero1))

}

    
