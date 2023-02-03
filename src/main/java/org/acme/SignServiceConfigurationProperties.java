package org.acme;

import org.springframework.boot.context.properties.ConfigurationProperties;
import se.swedenconnect.signservice.config.DefaultSignServiceConfigurationProperties;

@ConfigurationProperties("signservice")
public class SignServiceConfigurationProperties extends DefaultSignServiceConfigurationProperties {
}
