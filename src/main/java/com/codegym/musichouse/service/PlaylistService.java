package com.codegym.musichouse.service;

import com.codegym.musichouse.model.Playlist;
import com.codegym.musichouse.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PlaylistService {

    List<Playlist> findAll();

    List<Playlist> findAllByUserId(Long userId);

    Optional<Playlist> findById(Long id);

    Playlist findByIdPlaylist(Long id);

    void save(Playlist playlist);

    void delete(Long id);

    Optional<Playlist> findAllByPlaylistNameContaining(String playlist_name);

    Optional<Playlist> findAllByUserUsername(String user_name);
}
