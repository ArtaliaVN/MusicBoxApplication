package Artalia.com.example.MusicBox.Service;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ArtistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 25)
    private String artistName;

    @Column
    private String artistInformation;

    @OneToMany(mappedBy = "artist")
    private List<SongEntity> songs;
    
    public ArtistEntity(int id, String artistName, String artistInformation){
        this.id = id;
        this.artistName = artistName;
        this.artistInformation = artistInformation;
    }

    public void setArtistName(String artistName){
        this.artistName = artistName;
    }

    public void setArtistInformation(String artistInformation){
        this.artistInformation = artistInformation;
    }

    public int getArtistID(){
        return id;
    }

    public String setArtistName(){
        return artistName;
    }

    public String getArtistInformation(){
        return artistInformation;
    }
}
