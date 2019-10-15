package com.stackroute.Muzix.dao;

import com.stackroute.Muzix.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(CollectionResourceRel="tracks",path="tracks")
@Repository
public interface TrackRepository extends JpaRepository<Track, Integer> {
    Track findByTrackName(String trackName);
}
