package com.solid.codeviolation;

// Violation of Dependency Inversion Principle

public class Instagram implements SocialMediaActivities{

    public void doAuthentication() {
        System.out.println("Instagram has Two step verification, OTP Verification and Email Verification");
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
    public void postPhotosAndVideos() {
        System.out.println("Instagram supports Post Photos and Videos feature");
    }

    @Override
    public void addStories() {
        System.out.println("Instagram supports Add photos and videos as stories feature");
    }

    @Override
    public void groupVideoCall() {
        System.out.println("Instagram supports Group video call feature");
    }
}