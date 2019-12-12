package com.codegym.musichouse.service;

import com.codegym.musichouse.model.Playlist;
import com.codegym.musichouse.model.Singer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SingerService {
    List<Singer> findAll();

    List<Singer> findAllByUserId(Long userId);

    Singer findByIdSinger(Long id);

    void save(Singer singer);

    void delete(Long id);
}
