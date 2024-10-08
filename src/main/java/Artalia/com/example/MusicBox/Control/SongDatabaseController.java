package Artalia.com.example.MusicBox.Control;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Artalia.com.example.MusicBox.Service.SongEntity;
import Artalia.com.example.MusicBox.Service.SongRepository;

@RestController
public class SongDatabaseController {
    private final SongRepository songRepository;

    public SongDatabaseController(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    @PostMapping("/song/post")
    public SongEntity post(@RequestBody SongEntity songEntity){
        return songRepository.save(songEntity);
    }

    @GetMapping("/song/get/id={id}")
    public SongEntity getById(@PathVariable("id") int id){
        return songRepository.findById(id).orElse(null);
    }

    /* 
    @GetMapping("/song/get/artistname={artistname}")
    public List<SongEntity> getByArtistName(@PathVariable String artistname){
        return songRepository.findAll(artistname);
    }*/

    @GetMapping("/song/get/all")
    public List<SongEntity> getAll(){
        return songRepository.findAll();
    }
}
