package com.solid.codeviolation;

// Violation of Interface Segregation Principle.

public interface SocialMediaActivities {

    void chatWithFriends();

    void sharePhotosAndVideos();

    void postPhotosAndVideos();

    void addStories();

    void groupVideoCall();
}
