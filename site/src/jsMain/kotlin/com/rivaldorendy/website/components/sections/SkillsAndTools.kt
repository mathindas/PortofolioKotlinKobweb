package com.rivaldorendy.website.components.sections

import androidx.compose.runtime.Composable
import com.rivaldorendy.website.components.styles.ExperienceStyle
import com.rivaldorendy.website.components.styles.WorkExperienceItemRoleAndDurationStyle
import com.rivaldorendy.website.components.widgets.GlassBox
import com.rivaldorendy.website.components.widgets.SectionTitle
import com.rivaldorendy.website.utils.Constants
import com.rivaldorendy.website.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun SkillsAndTools() {
    Column(
        modifier = ExperienceStyle.toModifier().id("skills_and_tools"),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SectionTitle(Constants.SKILLS_AND_TOOLS_TITLE)

        SimpleGrid(
            modifier = Modifier.fillMaxWidth().margin(top = 2.cssRem),
            numColumns = numColumns(base = 1, sm = 2)
        ) {
            GlassBox(
                modifier = Modifier.margin(all = 2.cssRem)
            ) {
                SimpleGrid(
                    modifier = Modifier.padding(all = 1.cssRem),
                    numColumns = numColumns(base = 2, sm = 2, md = 3, lg = 4)
                ) {
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.KOTLIN
                    ) {
                        Image(
                            src = Res.Images.KOTLIN_LOGO,
                            modifier = Modifier.size(42.px)
                                .styleModifier {
                                    mixBlendMode(MixBlendMode.Normal)
                                }
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.JAVA
                    ) {
                        Image(
                            src = Res.Images.JAVA_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.DART
                    ) {
                        Image(
                            src = Res.Images.DART_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.SQL
                    ) {
                        Image(
                            src = Res.Images.SQL_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }

                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.PHP
                    ) {
                        Image(
                            src = Res.Images.PHP_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.CSHARP
                    ) {
                        Image(
                            src = Res.Images.CSHARP_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.GOLANG
                    ) {
                        Image(
                            src = Res.Images.GOLANG_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.XML
                    ) {
                        Image(
                            src = Res.Images.XML_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                }
            }

            GlassBox(
                modifier = Modifier.margin(all = 2.cssRem)
            ) {
                SimpleGrid(
                    modifier = Modifier.padding(all = 1.cssRem),
                    numColumns = numColumns(base = 2, sm = 2, md = 3, lg = 4)
                ) {
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.ANDROID_STUDIO
                    ) {
                        Image(
                            src = Res.Images.ANDROID_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.FLUTTER
                    ) {
                        Image(
                            src = Res.Images.FLUTTER_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.LARAVEL
                    ) {
                        Image(
                            src = Res.Images.LARAVEL_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.SQL_SERVER
                    ) {
                        Image(
                            src = Res.Images.SQL_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.FIGMA
                    ) {
                        Image(
                            src = Res.Images.FIGMA_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.DOCKER
                    ) {
                        Image(
                            src = Res.Images.DOCKER_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.GIT
                    ) {
                        Image(
                            src = Res.Images.GIT_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                    GlassBox(
                        modifier = Modifier.size(65.px)
                            .margin(all = 0.6.cssRem),
                        text = Constants.POSTMAN
                    ) {
                        Image(
                            src = Res.Images.POSTMAN_LOGO,
                            modifier = Modifier.size(42.px)
                        )
                    }
                }
            }
        }
    }
}