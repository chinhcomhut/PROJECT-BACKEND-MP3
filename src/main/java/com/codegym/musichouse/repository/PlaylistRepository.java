package com.codegym.musichouse.repository;

import com.codegym.musichouse.model.Playlist;
import com.codegym.musichouse.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist,Long> {
    Optional<Playlist> findAllByPlaylistNameContaining(String playlist_name);
    Optional<Playlist> findAllByUserUsername(String username);
    List<Playlist> findAllByUserId (Long userId);
}
