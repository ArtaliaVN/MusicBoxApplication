package Artalia.com.example.MusicBox.Control;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Artalia.com.example.MusicBox.Service.ArtistEntity;
import Artalia.com.example.MusicBox.Service.ArtistRepository;

@RestController
public class ArtistDatabaseController {
    private ArtistRepository artistRepository;

    public ArtistDatabaseController(ArtistRepository artistRepository){
        this.artistRepository = artistRepository;
    }

    @PostMapping("/artist/post")
    public ArtistEntity post(@RequestBody ArtistEntity artist){
        return artistRepository.save(artist);
    }

    @GetMapping("/artist/get/id={id}")
    public ArtistEntity getById(@PathVariable int id){
        return artistRepository.findById(id).orElse(null);
    }

    @GetMapping("/artist/get")
    public List<ArtistEntity> getAll(){
        return artistRepository.findAll();
    }
}
