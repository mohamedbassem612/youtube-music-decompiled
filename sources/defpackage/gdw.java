package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdw {
    private static final long d;
    public final mbc a;
    public final long b;
    public final Map c;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        d = 3600000L;
    }

    public gdw(mbc mbcVar) {
        long j = d;
        this.a = mbcVar;
        this.b = j;
        this.c = new HashMap();
    }
}
