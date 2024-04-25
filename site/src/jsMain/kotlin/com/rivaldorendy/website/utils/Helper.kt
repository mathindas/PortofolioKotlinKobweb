package com.rivaldorendy.website.utils

import com.rivaldorendy.website.components.model.WorkExperience

fun getAllProjects() =
    listOf(
        Pair(Res.Images.PROJECT_READBUD, Constants.PROJECT_READBUD_URL),
        Pair(Res.Images.PROJECT_JUSTAP, Constants.PROJECT_JUSTAP_URL),
        Pair(Res.Images.PROJECT_PASSGENIE, Constants.PROJECT_PASSGENIE_URL),
        Pair(Res.Images.PROJECT_MEDIFY, Constants.PROJECT_MEDIFY_URL),
        Pair(Res.Images.PROJECT_PRESIN, Constants.PROJECT_PRESIN_URL)
    )

fun getAllWorkExperience() = listOf(
    WorkExperience(
        sequenceNumber = "01",
        role = "Management Trainee Mobile Developer",
        organization = "Orang Tua Group",
        description = "Engaging in the study and development of applications across manufacturing, retail, and distribution sectors, while actively contributing to mobile application development and API/database development within the company.",
        duration = "Dec 21 - Apr 23"
    ),
    WorkExperience(
        sequenceNumber = "02",
        role = "Supervisor Mobile Application Development",
        organization = "Orang Tua Group",
        description = "I oversee multiple mobile application projects within the company, manage servers and databases associated with these applications, and provide leadership in team management throughout the development process.",
        duration = "Apr 23 - Present"
    )
)

fun getAllPhotographs() =
    listOf(
        Res.Images.IMAGE_1,
        Res.Images.IMAGE_2,
        Res.Images.IMAGE_3,
        Res.Images.IMAGE_4,
        Res.Images.IMAGE_5,
        Res.Images.IMAGE_6,
        Res.Images.IMAGE_7,
        Res.Images.IMAGE_8,
        Res.Images.IMAGE_9,
        Res.Images.IMAGE_10,
        Res.Images.IMAGE_11,
        Res.Images.IMAGE_12
    )