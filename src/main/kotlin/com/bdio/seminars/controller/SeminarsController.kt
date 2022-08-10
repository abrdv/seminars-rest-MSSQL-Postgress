package com.bdio.seminars.controller
import com.bdio.seminars.dto.SeminarsDTO
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime

@RestController
@RequestMapping("/seminars")
class SeminarsController {
    @GetMapping
    fun getAll(): List<SeminarsDTO> =
        listOf(
            SeminarsDTO(
                id = 1,
                themeTitle = "Семинар по Excel 2016",
                dateEvent = LocalDateTime.now(),

            )
        )
    @GetMapping("/{id}")
    fun getById(@PathVariable id:Int): SeminarsDTO = SeminarsDTO(
        id = 1,
        themeTitle = "Семинар по Excel 2016",
        dateEvent = LocalDateTime.now(),
    )
    @PostMapping
    fun create(@RequestBody dto :SeminarsDTO){

    }
    @PutMapping("/{id}")
    fun update(@PathVariable id:Int, @RequestBody dto :SeminarsDTO){

    }
    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id:Int){

    }
}