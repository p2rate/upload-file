package com.example.uploadingfiles.captcha;


import com.example.uploadingfiles.exception.ReCaptchaInvalidException;

public interface ICaptchaService {
    
    default void processResponse(final String response) throws ReCaptchaInvalidException {}
    
    default void processResponse(final String response, String action) throws ReCaptchaInvalidException {}
    
    String getReCaptchaSite();

    String getReCaptchaSecret();
}
