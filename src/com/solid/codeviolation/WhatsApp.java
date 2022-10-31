package com.solid.codeviolation;

// Violation of Single Responsibility Principle.

public class WhatsApp implements SocialMediaActivities {

    @Override
    public void chatWithFriends() {
        System.out.println("WhatsApp allows user to chat with friends");
    }

    @Override
    public void sharePhotosAndVideos() {
        System.out.println("WhatsApp supports Share Photos and Videos feature");
    }

    @Override
    public void postPhotosAndVideos() {
        // WhatsApp doesn't support this feature.
    }

    @Override
    public void addStories() {
        System.out.println("WhatsApp supports Add Stories feature");
    }

    @Override
    public void groupVideoCall() {
        System.out.println("WhatsApp supports Group Video Call");
    }
}
