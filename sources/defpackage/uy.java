package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class uy {
    public long a;
    public int b;
    public List c;
    private final String d;
    private final String e;
    private final String f;
    private long g;
    private final Map h;

    public uy(String str, String str2, String str3) {
        str.getClass();
        this.d = str;
        str2.getClass();
        this.e = str2;
        str3.getClass();
        this.f = str3;
        this.a = -1L;
        this.g = 0L;
        this.b = 0;
        this.h = new afv();
    }

    public final uz a() {
        long jCurrentTimeMillis = this.a;
        if (jCurrentTimeMillis == -1) {
            jCurrentTimeMillis = System.currentTimeMillis();
            this.a = jCurrentTimeMillis;
        }
        return new uz(this.d, this.e, this.f, jCurrentTimeMillis, this.g, this.b, new ArrayList(this.h.values()), this.c);
    }

    public final void b(String str, vi viVar) {
        viVar.getClass();
        this.h.put(str, viVar);
    }

    public final void c(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Document ttlMillis cannot be negative.");
        }
        this.g = j;
    }
}
