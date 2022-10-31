package com.solid.realTimeExample;

// Liskov Substitution Principle. Derived class must be substitutable to the Parent or base class.

// Dependency Inversion Principle. High level modules should depend on low level modules but, both should depend on abstraction.

public class Instagram implements SocialMediaActivities, PostPhotosAndVideos, GroupVideoCall, SecurityFeature, PerformSocialMediaActivities {

    @Override
    public void doSocialMediaActivities() {
        chatWithFriends();
        sharePhotosAndVideos();
        addStories();
        postPhotosAndVideos();
        groupVideoCall();
    }

    @Override
    public void chatWithFriends() {
        System.out.println("Instagram allows user to chat with friends");
    }

    @Override
    public void sharePhotosAndVideos() {
        System.out.println("Instagram supports Share Photos and Videos feature");
    }

    @Override
    public void addStories() {
        System.out.println("Instagram supports Add photos and videos as stories feature");
    }

    @Override
    public void postPhotosAndVideos() {
        System.out.println("Instagram supports Post Photos and Videos feature");
    }

    @Override
    public void groupVideoCall() {
        System.out.println("Instagram supports Group Video Call feature");
    }

    @Override
    public void doAuthentication() {
        System.out.println("Instagram has Two step verification, OTP Verification and Email Verification");
    }
}
