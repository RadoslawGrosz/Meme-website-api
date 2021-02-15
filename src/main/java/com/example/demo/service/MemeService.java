package com.example.demo.service;

import com.example.demo.dao.MemeDao;
import com.example.demo.model.Meme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemeService {

    private final MemeDao memeDao;

    @Autowired
    public MemeService(MemeDao memeDao) {
        this.memeDao = memeDao;
    }

    public String addMeme(Meme meme) {
        return memeDao.save(meme).getId();
    }

    public List<Meme> getMemes() {
        return memeDao.findAll();
    };

}
