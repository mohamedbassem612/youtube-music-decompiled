package com.facebook.yoga;

import defpackage.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class YogaLogLevel {
    public static final YogaLogLevel a;
    public static final YogaLogLevel b;
    public static final YogaLogLevel c;
    public static final YogaLogLevel d;
    public static final YogaLogLevel e;
    public static final YogaLogLevel f;
    private static final /* synthetic */ YogaLogLevel[] g;

    static {
        YogaLogLevel yogaLogLevel = new YogaLogLevel("ERROR", 0);
        a = yogaLogLevel;
        YogaLogLevel yogaLogLevel2 = new YogaLogLevel("WARN", 1);
        b = yogaLogLevel2;
        YogaLogLevel yogaLogLevel3 = new YogaLogLevel("INFO", 2);
        c = yogaLogLevel3;
        YogaLogLevel yogaLogLevel4 = new YogaLogLevel("DEBUG", 3);
        d = yogaLogLevel4;
        YogaLogLevel yogaLogLevel5 = new YogaLogLevel("VERBOSE", 4);
        e = yogaLogLevel5;
        YogaLogLevel yogaLogLevel6 = new YogaLogLevel("FATAL", 5);
        f = yogaLogLevel6;
        g = new YogaLogLevel[]{yogaLogLevel, yogaLogLevel2, yogaLogLevel3, yogaLogLevel4, yogaLogLevel5, yogaLogLevel6};
    }

    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return a;
        }
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return c;
        }
        if (i == 3) {
            return d;
        }
        if (i == 4) {
            return e;
        }
        if (i == 5) {
            return f;
        }
        throw new IllegalArgumentException(a.bR(i, "Unknown enum value: "));
    }

    public static YogaLogLevel[] values() {
        return (YogaLogLevel[]) g.clone();
    }
}
