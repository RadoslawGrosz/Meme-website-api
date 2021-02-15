package com.example.demo.api;

import com.example.demo.model.Meme;
import com.example.demo.service.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/meme")
@RestController
@CrossOrigin()
public class MemeController {

    private final MemeService memeService;

    @Autowired
    public MemeController(MemeService memeService) {
        this.memeService = memeService;
    }

    @PostMapping()
    public String addMeme(@RequestBody Meme meme) {
        return memeService.addMeme(meme);
    }

    @GetMapping()
    public List<Meme> getMemes() {
        return memeService.getMemes();
    }

}
