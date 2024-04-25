package com.rivaldorendy.website.components.styles

import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.vh

val SkillsAndToolsTitleStyle by ComponentStyle {
    base {
        Modifier.fontSize(FontSize.XXSmall)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.XSmall)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.Small)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.Small)
    }
}