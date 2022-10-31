package com.solid.realTimeExample;

public class SocialMediaSecurity {

    private SecurityFeature securityFeature;

    public SocialMediaSecurity(SecurityFeature securityFeature) {
        this.securityFeature = securityFeature;
    }

    public void socialMediaSecurityFeature() {
        securityFeature.doAuthentication();
    }
}
