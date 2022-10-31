package com.solid.codeviolation;

// Violation of Liskov Substitution Principle.
// Violation of Dependency Inversion Principle.

public class Facebook implements SocialMediaActivities {

    public void doAuthentication() {
        System.out.println("Instagram has Two step verification, OTP Verification and Email Verification");
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
    public void postPhotosAndVideos() {
        System.out.println("Facebook supports Post Photos and Videos feature");
    }

    @Override
    public void addStories() {
        System.out.println("Facebook supports Add photos and videos as stories feature");
    }

    @Override
    public void groupVideoCall() {
        // Facebook doesn't support this feature.
    }
}
