package com.deepshooter.composelandingpage.section

import androidx.compose.runtime.Composable
import com.deepshooter.composelandingpage.components.Header
import com.deepshooter.composelandingpage.components.SocialBar
import com.deepshooter.composelandingpage.models.Section
import com.deepshooter.composelandingpage.util.Constants.SECTION_WIDTH
import com.deepshooter.composelandingpage.util.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px


@Composable
fun MainSection() {

    Box(
        modifier = Modifier
            .id(Section.Home.id)
            .maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ) {

        MainBackground()
        MainContent()

    }

}


@Composable
fun MainBackground() {

    Image(
        modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Cover),
        src = Res.Image.background,
        desc = "Background Image"
    )

}

@Composable
fun MainContent() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        SocialBar()
    }

}