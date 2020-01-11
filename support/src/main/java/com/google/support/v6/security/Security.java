package com.google.support.v6.security;

public final class Security {

    static {
        System.loadLibrary("sgsupport-6.5.1");
    }

    public static native String md5sum(String file);
}
