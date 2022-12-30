package com.example.netty.client;

import java.io.IOException;

/**
 * @author wl
 **/
public class Client1 {
    public static void main(String[] args) throws IOException {
        new ChatClient().start("李四");
    }
}
