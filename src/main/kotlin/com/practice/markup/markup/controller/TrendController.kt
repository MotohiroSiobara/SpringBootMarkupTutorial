package com.practice.markup.markup.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("trend")
class TrendController {

    @GetMapping("")
    fun trend(): String {
        return "trend"
    }
}