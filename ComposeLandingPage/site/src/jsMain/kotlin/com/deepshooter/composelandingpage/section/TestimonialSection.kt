package com.deepshooter.composelandingpage.section

import androidx.compose.runtime.Composable
import com.deepshooter.composelandingpage.components.SectionTitle
import com.deepshooter.composelandingpage.components.TestimonialCards
import com.deepshooter.composelandingpage.models.Section
import com.deepshooter.composelandingpage.models.Testimonial
import com.deepshooter.composelandingpage.util.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px


@Composable
fun TestimonialSection() {
    Box(
        modifier = Modifier
            .id(Section.Testimonial.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        TestimonialContent()
    }
}

@Composable
fun TestimonialContent() {

    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            modifier = Modifier
                .fillMaxWidth()
                .margin(bottom = 25.px),
            section = Section.Testimonial,
            alignment = Alignment.CenterHorizontally
        )

        TestimonialCards(
            breakpoint = breakpoint,
            testimonial = Testimonial.First
        )

    }
}