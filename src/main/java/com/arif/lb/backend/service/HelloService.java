package com.arif.lb.backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
@Slf4j
public class HelloService {
    public String hello(String name) {
        return "{\"Message\":\"Hello " + (StringUtils.hasText(name) ? name : "world") + "!\"" +
                getInfo() + "}";
    }

    private String getInfo() {
        String res = "";
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            res = ",\"Hostname\" : \"" + inetAddress.getHostName() + "\"" +
                    ", \"HostAddress\" : \"" + inetAddress.getHostAddress() + "\"" +
                    ", \"CanonicalHostName\" : \"" + inetAddress.getCanonicalHostName() + "\"" +
                    ", \"HostAddress\" : \"" + inetAddress.getHostAddress() + "\"";
        } catch (UnknownHostException e) {
            log.error(e.getMessage(), e);
        }
        return res;
    }
}
