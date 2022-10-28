package com.solid.realTimeExample;

// Liskov Substitution Principle. Derived class must be substitutable to the Parent or base class.

// Dependency Inversion Principle. High level modules should depend on low level modules but, both should depend on abstraction.

public class Facebook implements SocialMediaActivities, PostPhotosAndVideos, SecurityFeature, PerformSocialMediaActivities {

    @Override
    public void doSocialMediaActivities() {
        chatWithFriends();
        sharePhotosAndVideos();
        addStories();
        postPhotosAndVideos();
    }

    @Override
    public void chatWithFriends() {
        System.out.println("Facebook allows user to chat with friends");
    }

    @Override
    public void sharePhotosAndVideos() {
        System.out.println("Facebook supports Share Photos and Videos feature");
    }

    @Override
    public void addStories() {
        System.out.println("Facebook supports Add stories feature");
    }

    @Override
    public void postPhotosAndVideos() {
        System.out.println("Facebook supports Post Photos and Videos");
    }

    @Override
    public void doAuthentication() {
        System.out.println("Facebook has Two step verification, OTP Verification and Email Verification");
    }
}
