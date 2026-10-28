package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cnd {
    private static final AtomicLong h = new AtomicLong();
    public final long a;
    public final byi b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public cnd(cnc cncVar) {
        this.a = cncVar.a;
        this.b = cncVar.b;
        this.c = cncVar.d;
        this.d = cncVar.e;
        this.e = cncVar.c;
        this.f = cncVar.f;
        this.g = cncVar.g;
    }

    public static long a() {
        return h.getAndIncrement();
    }
}
