package com.stylefeng.gunSelf.config;

import com.stylefeng.gunSelf.config.properties.GunSelfProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private GunSelfProperties gunSelfProperties;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // TODO Auto-generated method stub
    registry.addResourceHandler("/pictures/**").addResourceLocations("file:"+ gunSelfProperties.getFileUploadPath());
    super.addResourceHandlers(registry);

    }

}
