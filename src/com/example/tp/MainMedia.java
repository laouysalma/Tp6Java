package com.example.tp;

public class MainMedia {
    public static void main(String[] args) {
        MediaLibrary lib = new MediaLibrary();

        lib.add(new Audio("Podcast Java", 1800));
        lib.add(new Video("Tutoriel UML", 900, "1080p"));
        lib.add(new LiveStream("Concert en direct", "http://live.example.com"));
        lib.add(new Audio("Musique Classique", 2400));

        lib.playAll();
        System.out.println("\nDurée totale (sec) : " + lib.totalDuration());
    }
}
