package Models;

import lib.BaseModels;

import java.util.List;

public class People extends BaseModels {
    private String name;
    private String birth_year;
    private String eye_color;
    private String gender;
    private String hair_color;
    private String height;
    private String mass;
    private String skin_color;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
    private String url;
    private String created;
    private String edited;

    public People() {
    }

    public String getName() {
        return name;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getGender() {
        return gender;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getHeight() {
        return height;
    }

    public String getMass() {
        return mass;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public List<String> getFilms() {
        return films;
    }

    public List<String> getSpecies() {
        return species;
    }

    public List<String> getStarships() {
        return starships;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public String getUrl() {
        return url;
    }

    public String getCreated() {
        return created;
    }

    public String getEdited() {
        return edited;
    }
}
