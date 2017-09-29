package com.example.demo.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class AuditorAwareImpl implements AuditorAware<String> {
  
    @Override
    public String getCurrentAuditor() {
        return "Haris Khan";
    }
 
}