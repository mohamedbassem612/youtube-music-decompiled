package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agtu {
    private static String a = "agud";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "aguq";
    private static final String[] d = {"agud", "com.google.common.flogger.backend.google.GooglePlatform", "aguq"};

    public static int a() {
        return ((agvn) agvn.a.get()).b;
    }

    public static long b() {
        return agts.a.c();
    }

    public static agsw d(String str) {
        return agts.a.e(str);
    }

    public static agta f() {
        return i().a();
    }

    public static agtt g() {
        return agts.a.h();
    }

    public static aguu i() {
        return agts.a.j();
    }

    public static agva k() {
        return i().b();
    }

    public static String l() {
        return agts.a.m();
    }

    public static boolean n(String str, Level level, boolean z) {
        i().c(str, level, z);
        return false;
    }

    protected long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract agsw e(String str);

    protected abstract agtt h();

    protected aguu j() {
        return aguw.a;
    }

    protected abstract String m();
}
