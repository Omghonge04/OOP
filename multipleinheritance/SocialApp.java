package com.multipleinheritance;

public class SocialApp implements ReelsFeature, ChatFeature {

    @Override
    public void uploadReel() {
        System.out.println("Upload reel succesfully...!");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sent message succesfully...!");
    }
}