package com.ctrip.zeus.service;

import java.io.IOException;

/**
 * @author:xingchaowang
 * @date: 3/8/2015.
 */
public interface NginxService {
    String load() throws IOException;
}
