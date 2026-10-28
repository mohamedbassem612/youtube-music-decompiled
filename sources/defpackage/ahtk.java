package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahtk {
    public static final long a;
    public final String b;
    public final String c;
    public final long d;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 604800000L;
    }

    public ahtk(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.d = j;
    }
}
