package com.solid.codeviolation;

public class SolidPrinciplesImpl {

    public static void main(String[] args) {



        Instagram instagram = new Instagram();  // Violation of Dependency Inversion Principle
        SocialMediaSecurity socialMediaSecurity = new SocialMediaSecurity(instagram);
        socialMediaSecurity.socialMediaSecurityFeature();
    }
}