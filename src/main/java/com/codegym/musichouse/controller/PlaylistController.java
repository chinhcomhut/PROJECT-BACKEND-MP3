package com.codegym.musichouse.controller;

import com.codegym.musichouse.message.request.UpdatePlaylistForm;
import com.codegym.musichouse.message.respond.ResponseMessage;
import com.codegym.musichouse.model.Playlist;
import com.codegym.musichouse.security.services.UserPrinciple;
import com.codegym.musichouse.service.PlaylistService;
import com.codegym.musichouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @Autowired
    private UserService userService;

    private UserPrinciple getCurrentUser(){
        return (UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

//    @GetMapping("/")

    @PutMapping("/addSong/{id}")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public ResponseEntity<ResponseMessage> addSong(@Valid @RequestBody Playlist playlist, @PathVariable("id") Long id){
        Playlist playlist1 = playlistService.findByIdPlaylist(id);
        playlist1.setSongs(playlist.getSongs());
        playlistService.save(playlist1);
        return new ResponseEntity<ResponseMessage>(new ResponseMessage("add song successfully",null),HttpStatus.OK);
    }

    @PostMapping("/create")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public ResponseEntity<ResponseMessage> createPlaylist(@Valid @RequestBody Playlist playlist) {
        playlist.setUser(this.userService.findById(getCurrentUser().getId()));
        playlistService.save(playlist);
        return new ResponseEntity<ResponseMessage>(new ResponseMessage("Create playlist successfully!", null), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> getAllPlaylist() {
        List<Playlist> playlists = playlistService.findAll();
        return new ResponseEntity<>(playlists, HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPlaylist(@PathVariable("id") Long id) {
        Optional<Playlist> playlist = playlistService.findById(id);
        return new ResponseEntity<>(playlist, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public ResponseEntity<?> updatePlaylist(@Valid @RequestBody Playlist updatePlaylistForm, @PathVariable("id") Long id) {
        Playlist playlist = playlistService.findByIdPlaylist(id);
        playlist.setPlaylistName(updatePlaylistForm.getPlaylistName());
        playlist.setSongs(updatePlaylistForm.getSongs());
        playlist.setUser(updatePlaylistForm.getUser());
        playlistService.save(playlist);
        return new ResponseEntity<>(playlist, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public ResponseEntity<?> deletePlaylist(@PathVariable("id") Long id) {
        playlistService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
