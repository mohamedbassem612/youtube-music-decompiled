package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahrq {
    public static final long a;
    final String b;
    final String c;
    final long d;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 604800000L;
    }

    public ahrq(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.d = j;
    }
}
