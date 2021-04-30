package com.cbw.javase.day12;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddresses = InetAddress.getByName("127.0.0.1");
        System.out.println("inetAddresses.getAddress() : " + inetAddresses.getAddress());
        System.out.println(" : " + inetAddresses.getCanonicalHostName());
        System.out.println(inetAddresses.getHostName());
        System.out.println(inetAddresses.getHostAddress());
    }
}
