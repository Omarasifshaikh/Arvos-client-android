package com.arvos_app.arvos_client_android.model;

/**
 * Created by omar on 8/15/15.
 */
public class Directory {

    private String arvosVersion;
    private String name;
    private String author;
    private String url;
    private double lat;
    private double lon;
    private String description;
    private String category;

    public Directory() {}

    public Directory(String name) {
        this.name = name;
    }
    public Directory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Directory(String arvosVersion, String name, String author, String url,
                     double lat, double lon, double alt, double radius,
                     String description, String category) {
        super();
        this.arvosVersion = arvosVersion;
        this.name = name;
        this.author = author;
        this.url = url;
        this.lat = lat;
        this.lon = lon;
        this.description = description;
        this.category = category;
    }

    public String getArvosVersion() {
        return arvosVersion;
    }

    public void setArvosVersion(String arvosVersion) {
        this.arvosVersion = arvosVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Directory [arvosVersion=" + arvosVersion
                + ", name=" + name + ", author=" + author + ", url=" + url
                + ", lat=" + lat + ", lon=" + lon + ", description="
                + description + ", category=" + category + "]";
    }

}
