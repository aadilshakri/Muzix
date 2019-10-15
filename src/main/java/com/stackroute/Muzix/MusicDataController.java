package com.stackroute.Muzix;

import com.stackroute.Muzix.dao.TrackRepository;
import com.stackroute.Muzix.model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicDataController {
    @Autowired
    TrackRepository trackRepository;

    @PostMapping("/track")
    public Track addTrack(Track track){
        trackRepository.save(track);
        return track;
    }

    @GetMapping("/id/{trackId}")
    public Track getTrackById(@PathVariable int trackId){
        Track track = trackRepository.findById(trackId).orElse(null);
        return track;
    }

    @GetMapping("/name/{trackName}")
    public Track getTrackByName(@PathVariable String trackName){
        Track track = trackRepository.findByTrackName(trackName);
        return track;
    }

    @DeleteMapping("/track/{trackId}")
    public String removeTrack(@PathVariable int trackId){
        trackRepository.deleteById(trackId);
        return "Deleted";
    }

    @PutMapping("/track")
    public Track updateComments(Track track){
        trackRepository.save(track);
        return track;
    }

    @GetMapping("/tracks")
    public List<Track> showAllTracks(){
        return trackRepository.findAll();
    }
}
