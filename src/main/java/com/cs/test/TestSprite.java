package com.cs.test;

public class TestSprite {
    public static void main(String[] args) {

        String url="ftp://192.168.101.195:8010/faceRegister/5_5ffcec14aada4033977c17753e89d9b9.jpg";
        String[] split = url.split("://");
        String ftpSuffix = split[1];

        String ip = ftpSuffix.substring(0, ftpSuffix.indexOf(":"));
        String address = ftpSuffix.substring( ftpSuffix.indexOf("/"),ftpSuffix.length());
        System.out.println(ip);
        System.out.println(address);


        String substring = url.substring(url.indexOf("://"), url.indexOf(":"));
        System.out.println(substring);

        String iptest="192.168.101.195";
        String substring1 = iptest.substring(0, iptest.lastIndexOf(".") + 1);
        String gateway = substring1 + "1";
        System.out.println(gateway);

    }
}
