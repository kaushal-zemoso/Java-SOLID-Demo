package com.solid.codeviolation;

// Violation of Dependency Inversion Principle

public class SocialMediaSecurity {

    private Instagram instagram;

    public SocialMediaSecurity(Instagram instagram) {
        this.instagram = instagram;
    }

    public void socialMediaSecurityFeature() {
        instagram.doAuthentication();
    }
}
