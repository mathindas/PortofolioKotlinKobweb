package com.rivaldorendy.website.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.rivaldorendy.website.components.sections.Footer
import com.rivaldorendy.website.components.sections.NavHeader
import com.rivaldorendy.website.components.widgets.AppearanceAwareImage
import com.rivaldorendy.website.components.widgets.BackToTopButton
import com.rivaldorendy.website.utils.Constants
import com.rivaldorendy.website.utils.Res
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gridRow
import com.varabyte.kobweb.compose.ui.modifiers.gridTemplateRows
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.minWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.pointerEvents
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw

val PageContentStyle by ComponentStyle {
    base { Modifier.fillMaxSize().padding(leftRight = 2.cssRem, top = 4.cssRem) }
    Breakpoint.MD { Modifier.maxWidth(60.cssRem) }
}

@Composable
fun SVGBackroundCircle(modifier: Modifier) {
    AppearanceAwareImage(
        src = Res.Images.BACKGROUND_CIRCLES,
        modifier = modifier
    )
}

@Composable
fun PageLayout(title: String, content: @Composable ColumnScope.() -> Unit) {

    val breakpoint = rememberBreakpoint()

    val cursor = if (ColorMode.current.isDark) {
        Res.Images.CUSTOM_CURSOR_DARK
    } else {
        Res.Images.CUSTOM_CURSOR_LIGHT
    }

    LaunchedEffect(title) {
        document.title = "${Constants.NAME} - $title"
    }

    Box(
        Modifier
            .fillMaxWidth()
            .minHeight(100.percent)
            .styleModifier {
                property("cursor", "url('$cursor'), auto")
            }
            .gridTemplateRows { size(1.fr); size(minContent) },
        contentAlignment = Alignment.Center
    ) {
        SVGBackroundCircle(Modifier.align(Alignment.TopEnd).pointerEvents(PointerEvents.None).width(40.percent).minWidth(50.vw).styleModifier { property("height", "auto") })

        Column(
            Modifier.fillMaxSize().gridRow(1),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                PageContentStyle.toModifier(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                content()
            }
            BackToTopButton()
        }
        NavHeader(modifier = Modifier.position(Position.Fixed).top(0.px))
        Footer(breakpoint, Modifier.fillMaxWidth().gridRow(2))
    }
}
