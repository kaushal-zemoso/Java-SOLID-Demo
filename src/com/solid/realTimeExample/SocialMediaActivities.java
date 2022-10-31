package com.solid.realTimeExample;

// Interface Segregation Principle. No client should be forced to depend on methods which doesn't require them.

public interface SocialMediaActivities {

    void chatWithFriends();

    void sharePhotosAndVideos();

    void addStories();
}
