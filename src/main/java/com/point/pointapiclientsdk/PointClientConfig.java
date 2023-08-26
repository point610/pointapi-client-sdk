package com.point.pointapiclientsdk;

import com.point.pointapiclientsdk.client.PointApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName PointClientConfig
 * @Description TODO
 * @Author point
 * @Date 2023/7/26 12:59
 * @Version 1.0
 */
@Configuration
@ConfigurationProperties("point.client")
@Data
@ComponentScan
public class PointClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public PointApiClient pointApiClient() {
        return new PointApiClient(accessKey, secretKey);
    }
}
