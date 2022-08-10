package com.bdio.seminars.dto

import java.time.LocalDateTime

data class SeminarsDTO(
    val id: Int = 0,
    val themeTitle: String,
    val dateEvent: LocalDateTime? = null,
    val speakerFIO:String? = null

)