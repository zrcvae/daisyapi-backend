package com.daisyApi.daisyapiclientsdk;

import com.daisyApi.daisyapiclientsdk.client.DaisyApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * daisyApi 客户端配置
 */
@Configuration
@ConfigurationProperties("daisyapi.client")
@Data
@ComponentScan
public class DaisyApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public DaisyApiClient daisyApiClient() {
        return new DaisyApiClient(accessKey, secretKey);
    }

}
