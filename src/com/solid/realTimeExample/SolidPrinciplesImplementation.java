package com.solid.realTimeExample;


public class SolidPrinciplesImplementation {

    public static void main(String[] args) {

        SocialMediaActivities whatsAppSocialMediaActivities = new WhatsApp();   // Single Responsibility
        whatsAppSocialMediaActivities.sharePhotosAndVideos();

        SocialMediaPlatforms socialMediaPlatforms = new SocialMediaPlatforms();      // Open Closed Principle
        PerformSocialMediaActivities performSocialMediaActivities = new Facebook();
        socialMediaPlatforms.socialMediaPlatform(performSocialMediaActivities);

        SocialMediaActivities facebookSocialMediaActivities  = new Facebook();  // Liskov Substitution Principle
        facebookSocialMediaActivities.addStories();

        PostPhotosAndVideos facebookPostPhotosAndVideos = new Facebook();   // Interface Segregation Principle
        facebookPostPhotosAndVideos.postPhotosAndVideos();

        SecurityFeature securityFeature = new Instagram();  // Dependency Inversion principle
        SocialMediaSecurity socialMediaSecurity = new SocialMediaSecurity(securityFeature);
        socialMediaSecurity.socialMediaSecurityFeature();
    }
}