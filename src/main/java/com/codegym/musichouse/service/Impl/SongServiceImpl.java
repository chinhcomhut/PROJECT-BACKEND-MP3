package com.codegym.musichouse.service.Impl;

import com.codegym.musichouse.model.Song;
import com.codegym.musichouse.repository.SongRepository;
import com.codegym.musichouse.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongRepository songRepository;

    @Override
    public Optional<Song> findByNameSongContaining(String song) {
        return songRepository.findByNameSongContaining(song);
    }

    @Override
    public List<Song> findAllByUserId(Long userId) {
        return songRepository.findAllByUserId(userId);
    }

    @Override
    public List<Song> findAllByOrderByLikeSong() {
        return songRepository.findAllByOrderByLikeSongDesc();
    }

    @Override
    public List<Song> findAllByOrderByListenSong() {
        return songRepository.findAllByOrderByListenSongDesc();
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> findById(long id) {
        return songRepository.findById(id);
    }

    @Override
    public Song save(Song song) {
        return songRepository.save(song);
    }

    @Override
    public void delete(long id) {
        songRepository.deleteById(id);
    }

    @Override
    public Song findByIdSong(Long id) {
        return songRepository.findById(id).get();
    }
}
