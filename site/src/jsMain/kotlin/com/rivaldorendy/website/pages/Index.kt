package com.rivaldorendy.website.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.rivaldorendy.website.components.layouts.PageLayout
import com.rivaldorendy.website.components.sections.About
import com.rivaldorendy.website.components.sections.Experience
import com.rivaldorendy.website.components.sections.Home
import com.rivaldorendy.website.components.sections.Photography
import com.rivaldorendy.website.components.sections.Projects
import com.rivaldorendy.website.components.sections.SkillsAndTools
import com.rivaldorendy.website.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.*

@Page
@Composable
fun HomePage() {
    PageLayout("Home") {
        Row(
            Modifier.fillMaxWidth().fontFamily(Res.Fonts.Space_Grotesk).id("home")
        ) {
            Box {

                Column {

                    Home()

                    About()

                    Experience()

                    SkillsAndTools()

//                    Photography()

//                    Projects()
                }
            }
        }
    }
}