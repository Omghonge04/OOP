package com.multipleinheritance;

public class SmartPhone implements Camera, MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo using smartphone camera...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on smartphone...");
    }
}
