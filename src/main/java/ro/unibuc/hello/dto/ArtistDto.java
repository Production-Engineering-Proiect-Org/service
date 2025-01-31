package ro.unibuc.hello.dto;

import java.util.function.IntFunction;

public class ArtistDto {
    private int id;
    private String name;
    private String country;
    private String genres;
    private String albums;

    
    public ArtistDto() {
    }

    public ArtistDto(int id, String name, String country, String genres, String albums) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.genres = genres;
        this.albums = albums;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String content) {
        this.name = content;
    }
    public String getName() {
        return name;
    }


    public void setCountry(String contryString) {
        this.country = contryString;
    }
    public String getCountry() {
        return country;
    }

    public void setGenres(String genresString) {
        this.genres = genresString;
    }
    public String getGenres() {
        return genres;
    }

    public void setAlbums(String albumString) {
        this.albums = albumString;
    }
    public String getAlbums() {
        return albums;
    }
}